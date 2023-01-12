package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateWorkflowTypeInput extends StObject {
  
  /**
    * The name of the domain in which the workflow type is registered.
    */
  var domain: DomainName
  
  /**
    * The workflow type to deprecate.
    */
  var workflowType: WorkflowType
}
object DeprecateWorkflowTypeInput {
  
  inline def apply(domain: DomainName, workflowType: WorkflowType): DeprecateWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateWorkflowTypeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecateWorkflowTypeInput] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
