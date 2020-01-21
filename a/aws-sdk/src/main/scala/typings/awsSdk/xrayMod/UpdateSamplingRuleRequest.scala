package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSamplingRuleRequest extends js.Object {
  /**
    * The rule and fields to change.
    */
  var SamplingRuleUpdate: typings.awsSdk.xrayMod.SamplingRuleUpdate = js.native
}

object UpdateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRuleUpdate: SamplingRuleUpdate): UpdateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSamplingRuleRequest]
  }
}

