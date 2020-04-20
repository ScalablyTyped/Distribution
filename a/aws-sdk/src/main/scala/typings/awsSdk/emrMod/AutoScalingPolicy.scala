package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingPolicy extends js.Object {
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: ScalingConstraints = js.native
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: ScalingRuleList = js.native
}

object AutoScalingPolicy {
  @scala.inline
  def apply(Constraints: ScalingConstraints, Rules: ScalingRuleList): AutoScalingPolicy = {
    val __obj = js.Dynamic.literal(Constraints = Constraints.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicy]
  }
}

