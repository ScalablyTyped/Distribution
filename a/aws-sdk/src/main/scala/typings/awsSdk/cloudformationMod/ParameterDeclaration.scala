package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterDeclaration extends js.Object {
  
  /**
    * The default value of the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  
  /**
    * The description that is associate with the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
    */
  var NoEcho: js.UndefOr[typings.awsSdk.cloudformationMod.NoEcho] = js.native
  
  /**
    * The criteria that AWS CloudFormation uses to validate parameter values.
    */
  var ParameterConstraints: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterConstraints] = js.native
  
  /**
    * The name that is associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterKey] = js.native
  
  /**
    * The type of parameter.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.cloudformationMod.ParameterType] = js.native
}
object ParameterDeclaration {
  
  @scala.inline
  def apply(): ParameterDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterDeclaration]
  }
  
  @scala.inline
  implicit class ParameterDeclarationOps[Self <: ParameterDeclaration] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: ParameterValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setNoEcho(value: NoEcho): Self = this.set("NoEcho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEcho: Self = this.set("NoEcho", js.undefined)
    
    @scala.inline
    def setParameterConstraints(value: ParameterConstraints): Self = this.set("ParameterConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterConstraints: Self = this.set("ParameterConstraints", js.undefined)
    
    @scala.inline
    def setParameterKey(value: ParameterKey): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterKey: Self = this.set("ParameterKey", js.undefined)
    
    @scala.inline
    def setParameterType(value: ParameterType): Self = this.set("ParameterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterType: Self = this.set("ParameterType", js.undefined)
  }
}
