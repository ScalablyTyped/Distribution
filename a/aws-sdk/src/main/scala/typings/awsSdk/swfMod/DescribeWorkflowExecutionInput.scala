package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkflowExecutionInput extends StObject {
  
  /**
    * The name of the domain containing the workflow execution.
    */
  var domain: DomainName
  
  /**
    * The workflow execution to describe.
    */
  var execution: WorkflowExecution
}
object DescribeWorkflowExecutionInput {
  
  @scala.inline
  def apply(domain: DomainName, execution: WorkflowExecution): DescribeWorkflowExecutionInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowExecutionInput]
  }
  
  @scala.inline
  implicit class DescribeWorkflowExecutionInputMutableBuilder[Self <: DescribeWorkflowExecutionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution(value: WorkflowExecution): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
  }
}
