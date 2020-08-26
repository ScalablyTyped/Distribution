package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.native
  /**
    * The input value associated with the parameter.
    */
  var ParameterValue: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterValue] = js.native
  /**
    * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for  SSM parameter types in the template.
    */
  var ResolvedValue: js.UndefOr[ParameterValue] = js.native
  /**
    * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you specify true, do not specify a parameter value.
    */
  var UsePreviousValue: js.UndefOr[typings.awsSdk.cloudformationMod.UsePreviousValue] = js.native
}

object Parameter {
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
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
    def setParameterKey(value: ParameterKey): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterKey: Self = this.set("ParameterKey", js.undefined)
    @scala.inline
    def setParameterValue(value: ParameterValue): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterValue: Self = this.set("ParameterValue", js.undefined)
    @scala.inline
    def setResolvedValue(value: ParameterValue): Self = this.set("ResolvedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolvedValue: Self = this.set("ResolvedValue", js.undefined)
    @scala.inline
    def setUsePreviousValue(value: UsePreviousValue): Self = this.set("UsePreviousValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePreviousValue: Self = this.set("UsePreviousValue", js.undefined)
  }
  
}

