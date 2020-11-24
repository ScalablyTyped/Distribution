package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateTemplateOutput extends js.Object {
  
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.native
  
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typings.awsSdk.cloudformationMod.CapabilitiesReason] = js.native
  
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.native
  
  /**
    * The description found within the template.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  
  /**
    * A list of TemplateParameter structures.
    */
  var Parameters: js.UndefOr[TemplateParameters] = js.native
}
object ValidateTemplateOutput {
  
  @scala.inline
  def apply(): ValidateTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTemplateOutput]
  }
  
  @scala.inline
  implicit class ValidateTemplateOutputOps[Self <: ValidateTemplateOutput] (val x: Self) extends AnyVal {
    
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesReason(value: CapabilitiesReason): Self = this.set("CapabilitiesReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapabilitiesReason: Self = this.set("CapabilitiesReason", js.undefined)
    
    @scala.inline
    def setDeclaredTransformsVarargs(value: TransformName*): Self = this.set("DeclaredTransforms", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredTransforms(value: TransformsList): Self = this.set("DeclaredTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaredTransforms: Self = this.set("DeclaredTransforms", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: TemplateParameter*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: TemplateParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
