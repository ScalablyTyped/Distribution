package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelGraphics extends js.Object {
  var clampAnimations: Property | scala.Boolean = js.native
  var clippingPlanes: Property = js.native
  var color: Property = js.native
  var colorBlendAmount: Property | scala.Double = js.native
  var colorBlendMode: Property = js.native
  val definitionChanged: Event = js.native
  var distanceDisplayCondition: Property = js.native
  var heightReference: Property = js.native
  var incrementallyLoadTextures: Property | scala.Boolean = js.native
  var maximumScale: Property | scala.Double = js.native
  var minimumPixelSize: Property | scala.Double = js.native
  var minimumScale: Property | scala.Double = js.native
  var nodeTransformations: js.Any = js.native
   // PropertyBag
  var runAnimations: Property | scala.Boolean = js.native
  var scale: Property | scala.Double = js.native
  var shadows: Property = js.native
  var show: Property | scala.Boolean = js.native
  var silhouetteColor: Property = js.native
  var silhouetteSize: Property | scala.Double = js.native
  var uri: Property | java.lang.String = js.native
  def clone(result: ModelGraphics): ModelGraphics = js.native
  def merge(source: ModelGraphics): ModelGraphics = js.native
}

