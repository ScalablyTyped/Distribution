package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerrainData extends js.Object {
  var credits: js.Array[Credit]
  var waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement
  def interpolateHeight(rectangle: Rectangle, longitude: scala.Double, latitude: scala.Double): scala.Double
  def isChildAvailable(thisX: scala.Double, thisY: scala.Double, childX: scala.Double, childY: scala.Double): scala.Boolean
  def upsample(
    tilingScheme: TilingScheme,
    thisX: scala.Double,
    thisY: scala.Double,
    thisLevel: scala.Double,
    descendantX: scala.Double,
    descendantY: scala.Double,
    descendantLevel: scala.Double
  ): js.Promise[TerrainData]
  def wasCreatedByUpsampling(): scala.Boolean
}

object TerrainData {
  @scala.inline
  def apply(
    credits: js.Array[Credit],
    interpolateHeight: js.Function3[Rectangle, scala.Double, scala.Double, scala.Double],
    isChildAvailable: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Boolean],
    upsample: js.Function7[
      TilingScheme, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Promise[TerrainData]
    ],
    wasCreatedByUpsampling: js.Function0[scala.Boolean],
    waterMask: stdLib.Uint8Array | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement
  ): TerrainData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("credits")(credits)
    __obj.updateDynamic("interpolateHeight")(interpolateHeight)
    __obj.updateDynamic("isChildAvailable")(isChildAvailable)
    __obj.updateDynamic("upsample")(upsample)
    __obj.updateDynamic("wasCreatedByUpsampling")(wasCreatedByUpsampling)
    __obj.updateDynamic("waterMask")(waterMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerrainData]
  }
}

