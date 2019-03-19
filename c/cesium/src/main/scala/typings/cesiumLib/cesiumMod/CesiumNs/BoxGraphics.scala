package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxGraphics extends js.Object {
  var definitionChanged: Event[js.Array[_]] = js.native
  var dimensions: Property = js.native
  var fill: Property = js.native
  var material: MaterialProperty = js.native
  var outline: Property = js.native
  var outlineColor: Property = js.native
  var outlineWidth: Property = js.native
  var show: Property = js.native
  def clone(result: BoxGraphics): BoxGraphics = js.native
  def merge(source: BoxGraphics): BoxGraphics = js.native
}

