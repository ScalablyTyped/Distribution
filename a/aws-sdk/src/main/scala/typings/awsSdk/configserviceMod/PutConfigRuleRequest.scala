package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigRuleRequest extends js.Object {
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: typings.awsSdk.configserviceMod.ConfigRule = js.native
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.native
}

object PutConfigRuleRequest {
  @scala.inline
  def apply(ConfigRule: ConfigRule, Tags: TagsList = null): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
}

