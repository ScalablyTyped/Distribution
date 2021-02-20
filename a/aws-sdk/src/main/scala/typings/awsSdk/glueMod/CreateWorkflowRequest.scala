package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWorkflowRequest extends StObject {
  
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.native
  
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.native
  
  /**
    * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  var MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The name to be assigned to the workflow. It should be unique within your account.
    */
  var Name: NameString = js.native
  
  /**
    * The tags to be used with this workflow.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}
object CreateWorkflowRequest {
  
  @scala.inline
  def apply(Name: NameString): CreateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowRequest]
  }
  
  @scala.inline
  implicit class CreateWorkflowRequestMutableBuilder[Self <: CreateWorkflowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "DefaultRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRunPropertiesUndefined: Self = StObject.set(x, "DefaultRunProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: GenericString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setMaxConcurrentRuns(value: NullableInteger): Self = StObject.set(x, "MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "MaxConcurrentRuns", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
