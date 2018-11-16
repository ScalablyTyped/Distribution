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
  ): stdLib.Promise[TerrainData]
  def wasCreatedByUpsampling(): scala.Boolean
}

