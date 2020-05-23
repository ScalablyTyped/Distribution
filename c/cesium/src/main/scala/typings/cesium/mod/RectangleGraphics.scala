package typings.cesium.mod

import typings.cesium.anon.CloseTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RectangleGraphics")
@js.native
class RectangleGraphics () extends js.Object {
  def this(options: CloseTop) = this()
  var closeBottom: Property = js.native
  var closeTop: Property = js.native
  var coordinates: Property = js.native
  var definitionChanged: Event[js.Array[_]] = js.native
  var extrudedHeight: Property = js.native
  var fill: Property = js.native
  var granularity: Property = js.native
  var height: Property = js.native
  var material: MaterialProperty = js.native
  var outline: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var rotation: Property = js.native
  var show: Property = js.native
  var stRotation: Property = js.native
  def clone(result: RectangleGraphics): RectangleGraphics = js.native
  def merge(source: RectangleGraphics): RectangleGraphics = js.native
}

