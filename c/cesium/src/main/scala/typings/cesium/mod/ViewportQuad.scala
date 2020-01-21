package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ViewportQuad")
@js.native
class ViewportQuad () extends js.Object {
  def this(rectangle: BoundingRectangle) = this()
  def this(rectangle: BoundingRectangle, material: Material) = this()
  var material: Material = js.native
  var rectangle: BoundingRectangle = js.native
  var show: Boolean = js.native
  def destroy(): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def update(): Unit = js.native
}

