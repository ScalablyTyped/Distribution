package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventRiskType extends js.Object {
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
  def apply(RiskDecision: RiskDecisionType = null, RiskLevel: RiskLevelType = null): EventRiskType = {
    val __obj = js.Dynamic.literal()
    if (RiskDecision != null) __obj.updateDynamic("RiskDecision")(RiskDecision.asInstanceOf[js.Any])
    if (RiskLevel != null) __obj.updateDynamic("RiskLevel")(RiskLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRiskType]
  }
}

