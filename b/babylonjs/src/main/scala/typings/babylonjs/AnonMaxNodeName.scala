package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxNodeName extends js.Object {
  var maxNodeName: String
  var minNodeName: String
  var valueNodeName: String
}

object AnonMaxNodeName {
  @scala.inline
  def apply(maxNodeName: String, minNodeName: String, valueNodeName: String): AnonMaxNodeName = {
    val __obj = js.Dynamic.literal(maxNodeName = maxNodeName.asInstanceOf[js.Any], minNodeName = minNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxNodeName]
  }
}

