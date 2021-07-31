package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateInput extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated template. If you specify a name, you must also specify the StackName.
    */
  var ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.undefined
  
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: js.UndefOr[typings.awsSdk.cloudformationMod.StackName] = js.undefined
  
  /**
    * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the user-submitted template, specify Original. To get the template after AWS CloudFormation has processed all transforms, specify Processed.  If the template doesn't include transforms, Original and Processed return the same template. By default, AWS CloudFormation specifies Original. 
    */
  var TemplateStage: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateStage] = js.undefined
}
object GetTemplateInput {
  
  @scala.inline
  def apply(): GetTemplateInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateInput]
  }
  
  @scala.inline
  implicit class GetTemplateInputMutableBuilder[Self <: GetTemplateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSetName(value: ChangeSetNameOrId): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    @scala.inline
    def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    @scala.inline
    def setTemplateStage(value: TemplateStage): Self = StObject.set(x, "TemplateStage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateStageUndefined: Self = StObject.set(x, "TemplateStage", js.undefined)
  }
}
