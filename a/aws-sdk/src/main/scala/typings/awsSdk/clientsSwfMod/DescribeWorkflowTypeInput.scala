package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkflowTypeInput extends StObject {
  
  /**
    * The name of the domain in which this workflow type is registered.
    */
  var domain: DomainName
  
  /**
    * The workflow type to describe.
    */
  var workflowType: WorkflowType
}
object DescribeWorkflowTypeInput {
  
  inline def apply(domain: DomainName, workflowType: WorkflowType): DescribeWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkflowTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorkflowTypeInput] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
