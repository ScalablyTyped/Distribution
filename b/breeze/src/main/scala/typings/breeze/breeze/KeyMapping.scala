package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapping extends js.Object {
  var entityTypeName: String
  var realValue: js.Any
  var tempValue: js.Any
}

object KeyMapping {
  @scala.inline
  def apply(entityTypeName: String, realValue: js.Any, tempValue: js.Any): KeyMapping = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any], realValue = realValue.asInstanceOf[js.Any], tempValue = tempValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapping]
  }
}

