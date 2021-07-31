package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDomainInput extends StObject {
  
  /**
    * A text description of the domain.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Name of the domain to register. The name must be unique in the region that the domain is registered in. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var name: DomainName
  
  /**
    * Tags to be added when registering a domain. Tags may only contain unicode letters, digits, whitespace, or these symbols: _ . : / = + - @.
    */
  var tags: js.UndefOr[ResourceTagList] = js.undefined
  
  /**
    * The duration (in days) that records and histories of workflow executions on the domain should be kept by the service. After the retention period, the workflow execution isn't available in the results of visibility calls. If you pass the value NONE or 0 (zero), then the workflow execution history isn't retained. As soon as the workflow execution completes, the execution record and its history are deleted. The maximum workflow execution retention period is 90 days. For more information about Amazon SWF service limits, see: Amazon SWF Service Limits in the Amazon SWF Developer Guide.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays
}
object RegisterDomainInput {
  
  @scala.inline
  def apply(name: DomainName, workflowExecutionRetentionPeriodInDays: DurationInDays): RegisterDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDomainInput]
  }
  
  @scala.inline
  implicit class RegisterDomainInputMutableBuilder[Self <: RegisterDomainInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: ResourceTagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setWorkflowExecutionRetentionPeriodInDays(value: DurationInDays): Self = StObject.set(x, "workflowExecutionRetentionPeriodInDays", value.asInstanceOf[js.Any])
  }
}
