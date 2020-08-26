package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * Specifies the key for the condition. Currently the only supported key is aws:PrincipalOrgID.
    */
  var Key: String = js.native
  /**
    * Specifies the type of condition. Currently the only supported value is StringEquals.
    */
  var Type: String = js.native
  /**
    * Specifies the value for the key. Currently, this must be the ID of the organization.
    */
  var Value: String = js.native
}

object Condition {
  @scala.inline
  def apply(Key: String, Type: String, Value: String): Condition = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

