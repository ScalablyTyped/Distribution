package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelParameterVersionResult extends js.Object {
  
  /**
    * The label does not meet the requirements. For information about parameter label requirements, see Labeling parameters in the AWS Systems Manager User Guide.
    */
  var InvalidLabels: js.UndefOr[ParameterLabelList] = js.native
  
  /**
    * The version of the parameter that has been labeled.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.native
}
object LabelParameterVersionResult {
  
  @scala.inline
  def apply(): LabelParameterVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelParameterVersionResult]
  }
  
  @scala.inline
  implicit class LabelParameterVersionResultOps[Self <: LabelParameterVersionResult] (val x: Self) extends AnyVal {
    
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
    def setInvalidLabelsVarargs(value: ParameterLabel*): Self = this.set("InvalidLabels", js.Array(value :_*))
    
    @scala.inline
    def setInvalidLabels(value: ParameterLabelList): Self = this.set("InvalidLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidLabels: Self = this.set("InvalidLabels", js.undefined)
    
    @scala.inline
    def setParameterVersion(value: PSParameterVersion): Self = this.set("ParameterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterVersion: Self = this.set("ParameterVersion", js.undefined)
  }
}
