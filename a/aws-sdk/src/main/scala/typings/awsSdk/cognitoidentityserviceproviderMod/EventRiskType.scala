package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventRiskType extends js.Object {
  
  /**
    * Indicates whether compromised credentials were detected during an authentication event.
    */
  var CompromisedCredentialsDetected: js.UndefOr[WrappedBooleanType] = js.native
  
  /**
    * The risk decision.
    */
  var RiskDecision: js.UndefOr[RiskDecisionType] = js.native
  
  /**
    * The risk level.
    */
  var RiskLevel: js.UndefOr[RiskLevelType] = js.native
}
object EventRiskType {
  
  @scala.inline
  def apply(): EventRiskType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventRiskType]
  }
  
  @scala.inline
  implicit class EventRiskTypeOps[Self <: EventRiskType] (val x: Self) extends AnyVal {
    
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
    def setCompromisedCredentialsDetected(value: WrappedBooleanType): Self = this.set("CompromisedCredentialsDetected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompromisedCredentialsDetected: Self = this.set("CompromisedCredentialsDetected", js.undefined)
    
    @scala.inline
    def setRiskDecision(value: RiskDecisionType): Self = this.set("RiskDecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskDecision: Self = this.set("RiskDecision", js.undefined)
    
    @scala.inline
    def setRiskLevel(value: RiskLevelType): Self = this.set("RiskLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiskLevel: Self = this.set("RiskLevel", js.undefined)
  }
}
