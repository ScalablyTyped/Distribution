package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateOutput extends StObject {
  
  /**
    * The stage of the template that you can retrieve. For stacks, the Original and Processed templates are always available. For change sets, the Original template is always available. After AWS CloudFormation finishes creating the change set, the Processed template becomes available.
    */
  var StagesAvailable: js.UndefOr[StageList] = js.undefined
  
  /**
    * Structure containing the template body. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) AWS CloudFormation returns the same template that was used when the stack was created.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.undefined
}
object GetTemplateOutput {
  
  @scala.inline
  def apply(): GetTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateOutput]
  }
  
  @scala.inline
  implicit class GetTemplateOutputMutableBuilder[Self <: GetTemplateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStagesAvailable(value: StageList): Self = StObject.set(x, "StagesAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStagesAvailableUndefined: Self = StObject.set(x, "StagesAvailable", js.undefined)
    
    @scala.inline
    def setStagesAvailableVarargs(value: TemplateStage*): Self = StObject.set(x, "StagesAvailable", js.Array(value :_*))
    
    @scala.inline
    def setTemplateBody(value: TemplateBody): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
  }
}
