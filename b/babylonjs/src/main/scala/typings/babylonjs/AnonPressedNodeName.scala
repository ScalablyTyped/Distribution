package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPressedNodeName extends js.Object {
  var pressedNodeName: String
  var unpressedNodeName: String
  var valueNodeName: String
}

object AnonPressedNodeName {
  @scala.inline
  def apply(pressedNodeName: String, unpressedNodeName: String, valueNodeName: String): AnonPressedNodeName = {
    val __obj = js.Dynamic.literal(pressedNodeName = pressedNodeName.asInstanceOf[js.Any], unpressedNodeName = unpressedNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPressedNodeName]
  }
}

