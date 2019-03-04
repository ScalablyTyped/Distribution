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
    val __obj = js.Dynamic.literal(id = id, matrix = matrix, name = name, show = show)
  
    __obj.asInstanceOf[ModelNode]
  }
}

