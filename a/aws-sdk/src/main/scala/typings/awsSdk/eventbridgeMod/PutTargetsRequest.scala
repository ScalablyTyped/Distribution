package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTargetsRequest extends js.Object {
  
  /**
    * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[EventBusNameOrArn] = js.native
  
  /**
    * The name of the rule.
    */
  var Rule: RuleName = js.native
  
  /**
    * The targets to update or add to the rule.
    */
  var Targets: TargetList = js.native
}
object PutTargetsRequest {
  
  @scala.inline
  def apply(Rule: RuleName, Targets: TargetList): PutTargetsRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTargetsRequest]
  }
  
  @scala.inline
  implicit class PutTargetsRequestOps[Self <: PutTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRule(value: RuleName): Self = this.set("Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: TargetList): Self = this.set("Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusName(value: EventBusNameOrArn): Self = this.set("EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBusName: Self = this.set("EventBusName", js.undefined)
  }
}
