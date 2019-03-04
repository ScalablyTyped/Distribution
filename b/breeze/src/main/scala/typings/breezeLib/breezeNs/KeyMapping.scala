package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMapping extends js.Object {
  var entityTypeName: java.lang.String
  var realValue: js.Any
  var tempValue: js.Any
}

object KeyMapping {
  @scala.inline
  def apply(entityTypeName: java.lang.String, realValue: js.Any, tempValue: js.Any): KeyMapping = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName, realValue = realValue, tempValue = tempValue)
  
    __obj.asInstanceOf[KeyMapping]
  }
}

