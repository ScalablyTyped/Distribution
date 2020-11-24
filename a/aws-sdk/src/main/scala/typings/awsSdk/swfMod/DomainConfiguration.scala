package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainConfiguration extends js.Object {
  
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
  implicit class DomainConfigurationOps[Self <: DomainConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setWorkflowExecutionRetentionPeriodInDays(value: DurationInDays): Self = this.set("workflowExecutionRetentionPeriodInDays", value.asInstanceOf[js.Any])
  }
}
