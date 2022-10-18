package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainConfiguration extends StObject {
  
  /**
    * The retention period for workflow executions in this domain.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays
}
object DomainConfiguration {
  
  inline def apply(workflowExecutionRetentionPeriodInDays: DurationInDays): DomainConfiguration = {
    val __obj = js.Dynamic.literal(workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainConfiguration]
  }
  
  extension [Self <: DomainConfiguration](x: Self) {
    
    inline def setWorkflowExecutionRetentionPeriodInDays(value: DurationInDays): Self = StObject.set(x, "workflowExecutionRetentionPeriodInDays", value.asInstanceOf[js.Any])
  }
}
