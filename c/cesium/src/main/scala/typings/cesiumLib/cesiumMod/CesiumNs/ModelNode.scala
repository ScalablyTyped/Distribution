package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelNode extends js.Object {
  var id: java.lang.String
  var matrix: Matrix4
  var name: java.lang.String
  var show: scala.Boolean
}

object ModelNode {
  @scala.inline
  def apply(id: java.lang.String, matrix: Matrix4, name: java.lang.String, show: scala.Boolean): ModelNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("matrix")(matrix)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[ModelNode]
  }
}

