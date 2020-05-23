package typings.cesium.mod

import typings.cesium.anon.OutlineColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "EllipsoidGraphics")
@js.native
class EllipsoidGraphics () extends js.Object {
  def this(options: OutlineColor) = this()
  var definitionChanged: Event[js.Array[_]] = js.native
  var fill: Property = js.native
  var material: MaterialProperty = js.native
  var outline: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var radii: Property = js.native
  var show: Property = js.native
  var slicePartitions: Property = js.native
  var stackPartitions: Property = js.native
  var subdivisions: Property = js.native
  def clone(result: EllipsoidGraphics): EllipsoidGraphics = js.native
  def merge(source: EllipsoidGraphics): EllipsoidGraphics = js.native
}

