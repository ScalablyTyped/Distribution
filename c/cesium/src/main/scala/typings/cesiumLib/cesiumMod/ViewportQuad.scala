package typings
package cesiumLib.cesiumMod

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
  var show: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def isDestroyed(): scala.Boolean = js.native
  def update(): scala.Unit = js.native
}

