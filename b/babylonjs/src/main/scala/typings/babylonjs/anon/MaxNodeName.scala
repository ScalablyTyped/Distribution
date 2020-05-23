package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxNodeName extends js.Object {
  var maxNodeName: String
  var minNodeName: String
  var valueNodeName: String
}

object MaxNodeName {
  @scala.inline
  def apply(maxNodeName: String, minNodeName: String, valueNodeName: String): MaxNodeName = {
    val __obj = js.Dynamic.literal(maxNodeName = maxNodeName.asInstanceOf[js.Any], minNodeName = minNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNodeName]
  }
}

