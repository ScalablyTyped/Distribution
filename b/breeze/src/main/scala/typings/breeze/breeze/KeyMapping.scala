package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyMapping extends js.Object {
  var entityTypeName: String = js.native
  var realValue: js.Any = js.native
  var tempValue: js.Any = js.native
}

object KeyMapping {
  @scala.inline
  def apply(entityTypeName: String, realValue: js.Any, tempValue: js.Any): KeyMapping = {
    val __obj = js.Dynamic.literal(entityTypeName = entityTypeName.asInstanceOf[js.Any], realValue = realValue.asInstanceOf[js.Any], tempValue = tempValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyMapping]
  }
  @scala.inline
  implicit class KeyMappingOps[Self <: KeyMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntityTypeName(value: String): Self = this.set("entityTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRealValue(value: js.Any): Self = this.set("realValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setTempValue(value: js.Any): Self = this.set("tempValue", value.asInstanceOf[js.Any])
  }
  
}

