package typings.cesium.mod

import typings.cesium.AnonAlignedAxis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BillboardGraphics")
@js.native
class BillboardGraphics () extends js.Object {
  def this(options: AnonAlignedAxis) = this()
  var alignedAxis: Property = js.native
  var color: Property = js.native
  var definitionChanged: Event[js.Array[_]] = js.native
  var disableDepthTestDistance: Property = js.native
  var eyeOffset: Property = js.native
  var height: Property = js.native
  var horizontalOrigin: Property = js.native
  var image: Property = js.native
  var imageSubRegion: Property = js.native
  var pixelOffset: Property = js.native
  var pixelOffsetScaleByDistance: Property = js.native
  var rotation: Property = js.native
  var scale: Property = js.native
  var scaleByDistance: Property = js.native
  var show: Property = js.native
  var translucencyByDistance: Property = js.native
  var verticalOrigin: Property = js.native
  var width: Property = js.native
  def clone(result: BillboardGraphics): BillboardGraphics = js.native
  def merge(source: BillboardGraphics): BillboardGraphics = js.native
}

