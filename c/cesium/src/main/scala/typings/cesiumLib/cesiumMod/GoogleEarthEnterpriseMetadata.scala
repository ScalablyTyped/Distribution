package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
class GoogleEarthEnterpriseMetadata protected ()
  extends cesiumLib.cesiumMod.CesiumNs.GoogleEarthEnterpriseMetadata {
  def this(resourceOrUrl: cesiumLib.cesiumMod.CesiumNs.Resource) = this()
  def this(resourceOrUrl: java.lang.String) = this()
  /* CompleteClass */
  override var imageryPresent: scala.Boolean = js.native
  /* CompleteClass */
  override var key: stdLib.ArrayBuffer = js.native
  /* CompleteClass */
  override var negativeAltitudeExponentBias: scala.Double = js.native
  /* CompleteClass */
  override var negativeAltitudeThreshold: scala.Double = js.native
  /* CompleteClass */
  override var protoImagery: scala.Boolean = js.native
  /* CompleteClass */
  override val proxy: cesiumLib.cesiumMod.CesiumNs.Proxy = js.native
  /* CompleteClass */
  override val readyPromise: js.Promise[scala.Boolean] = js.native
  /* CompleteClass */
  override val resource: cesiumLib.cesiumMod.CesiumNs.Resource = js.native
  /* CompleteClass */
  override var terrainPresent: scala.Boolean = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
}

/* static members */
@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
object GoogleEarthEnterpriseMetadata extends js.Object {
  def quadKeyToTileXY(quadkey: java.lang.String): cesiumLib.Anon_Level = js.native
  def tileXYToQuadKey(x: scala.Double, y: scala.Double, level: scala.Double): java.lang.String = js.native
}

