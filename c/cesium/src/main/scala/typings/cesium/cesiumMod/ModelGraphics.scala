package typings.cesium.cesiumMod

import typings.cesium.Anon_ClampAnimations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ModelGraphics")
@js.native
class ModelGraphics () extends js.Object {
  def this(options: Anon_ClampAnimations) = this()
  var clampAnimations: Property | Boolean = js.native
  var clippingPlanes: Property = js.native
  var color: Property = js.native
  var colorBlendAmount: Property | Double = js.native
  var colorBlendMode: Property = js.native
  val definitionChanged: Event[js.Array[_]] = js.native
  var distanceDisplayCondition: Property = js.native
  var heightReference: Property = js.native
  var incrementallyLoadTextures: Property | Boolean = js.native
  var maximumScale: Property | Double = js.native
  var minimumPixelSize: Property | Double = js.native
  var minimumScale: Property | Double = js.native
  var nodeTransformations: js.Any = js.native
   // PropertyBag
  var runAnimations: Property | Boolean = js.native
  var scale: Property | Double = js.native
  var shadows: Property = js.native
  var show: Property | Boolean = js.native
  var silhouetteColor: Property = js.native
  var silhouetteSize: Property | Double = js.native
  var uri: Property | String = js.native
  def clone(result: ModelGraphics): ModelGraphics = js.native
  def merge(source: ModelGraphics): ModelGraphics = js.native
}

