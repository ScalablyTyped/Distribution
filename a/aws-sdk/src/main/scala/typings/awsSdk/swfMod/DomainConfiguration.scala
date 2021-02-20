package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainConfiguration extends StObject {
  
  /**
    * The retention period for workflow executions in this domain.
    */
  var workflowExecutionRetentionPeriodInDays: DurationInDays = js.native
}
object DomainConfiguration {
  
  @scala.inline
  def apply(workflowExecutionRetentionPeriodInDays: DurationInDays): DomainConfiguration = {
    val __obj = js.Dynamic.literal(workflowExecutionRetentionPeriodInDays = workflowExecutionRetentionPeriodInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainConfiguration]
  }
  
  @scala.inline
  implicit class DomainConfigurationMutableBuilder[Self <: DomainConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkflowExecutionRetentionPeriodInDays(value: DurationInDays): Self = StObject.set(x, "workflowExecutionRetentionPeriodInDays", value.asInstanceOf[js.Any])
  }
}
