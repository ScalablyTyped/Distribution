package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeprecateWorkflowTypeInput extends StObject {
  
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var domain: DomainName
  
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var workflowType: WorkflowType
}
object UndeprecateWorkflowTypeInput {
  
  inline def apply(domain: DomainName, workflowType: WorkflowType): UndeprecateWorkflowTypeInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], workflowType = workflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeprecateWorkflowTypeInput]
  }
  
  extension [Self <: UndeprecateWorkflowTypeInput](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "workflowType", value.asInstanceOf[js.Any])
  }
}
