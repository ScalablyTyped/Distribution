package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowRequest extends StObject {
  
  /**
    * A collection of properties to be used as part of each execution of the workflow.
    */
  var DefaultRunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
  
  /**
    * A description of the workflow.
    */
  var Description: js.UndefOr[GenericString] = js.undefined
  
  /**
    * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component jobs. If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
    */
  var MaxConcurrentRuns: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The name to be assigned to the workflow. It should be unique within your account.
    */
  var Name: NameString
  
  /**
    * The tags to be used with this workflow.
    */
  var Tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateWorkflowRequest {
  
  inline def apply(Name: NameString): CreateWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowRequest]
  }
  
  extension [Self <: CreateWorkflowRequest](x: Self) {
    
    inline def setDefaultRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "DefaultRunProperties", value.asInstanceOf[js.Any])
    
    inline def setDefaultRunPropertiesUndefined: Self = StObject.set(x, "DefaultRunProperties", js.undefined)
    
    inline def setDescription(value: GenericString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMaxConcurrentRuns(value: NullableInteger): Self = StObject.set(x, "MaxConcurrentRuns", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentRunsUndefined: Self = StObject.set(x, "MaxConcurrentRuns", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
