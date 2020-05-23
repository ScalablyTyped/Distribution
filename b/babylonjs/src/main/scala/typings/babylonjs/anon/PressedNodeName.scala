package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PressedNodeName extends js.Object {
  var pressedNodeName: String
  var unpressedNodeName: String
  var valueNodeName: String
}

object PressedNodeName {
  @scala.inline
  def apply(pressedNodeName: String, unpressedNodeName: String, valueNodeName: String): PressedNodeName = {
    val __obj = js.Dynamic.literal(pressedNodeName = pressedNodeName.asInstanceOf[js.Any], unpressedNodeName = unpressedNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PressedNodeName]
  }
}

