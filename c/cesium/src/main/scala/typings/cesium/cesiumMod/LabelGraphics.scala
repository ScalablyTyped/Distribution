package typings.cesium.cesiumMod

import typings.cesium.Anon_EyeOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "LabelGraphics")
@js.native
class LabelGraphics () extends js.Object {
  def this(options: Anon_EyeOffset) = this()
  var definitionChanged: Event[js.Array[_]] = js.native
  var eyeOffset: Property = js.native
  var fillColor: Color = js.native
  var font: String = js.native
  var horizontalOrigin: Property = js.native
  var outlineColor: Color = js.native
  var outlineWidth: Double = js.native
  var pixelOffset: Property = js.native
  var pixelOffsetScaleByDistance: Property = js.native
  var scale: Property = js.native
  var show: Property = js.native
  var style: Property = js.native
  var text: Property = js.native
  var translucencyByDistance: Property = js.native
  var verticalOrigin: Property = js.native
  def clone(result: LabelGraphics): LabelGraphics = js.native
  def merge(source: LabelGraphics): LabelGraphics = js.native
}

