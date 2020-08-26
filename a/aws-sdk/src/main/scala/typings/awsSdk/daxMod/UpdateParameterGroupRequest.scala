package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParameterGroupRequest extends js.Object {
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: String = js.native
  /**
    * An array of name-value pairs for the parameters in the group. Each element in the array represents a single parameter.
    */
  var ParameterNameValues: ParameterNameValueList = js.native
}

object UpdateParameterGroupRequest {
  @scala.inline
  def apply(ParameterGroupName: String, ParameterNameValues: ParameterNameValueList): UpdateParameterGroupRequest = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any], ParameterNameValues = ParameterNameValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParameterGroupRequest]
  }
  @scala.inline
  implicit class UpdateParameterGroupRequestOps[Self <: UpdateParameterGroupRequest] (val x: Self) extends AnyVal {
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
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterNameValuesVarargs(value: ParameterNameValue*): Self = this.set("ParameterNameValues", js.Array(value :_*))
    @scala.inline
    def setParameterNameValues(value: ParameterNameValueList): Self = this.set("ParameterNameValues", value.asInstanceOf[js.Any])
  }
  
}

