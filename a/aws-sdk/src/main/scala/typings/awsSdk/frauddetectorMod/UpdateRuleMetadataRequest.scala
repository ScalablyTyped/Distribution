package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleMetadataRequest extends js.Object {
  /**
    * The rule description.
    */
  var description: typings.awsSdk.frauddetectorMod.description = js.native
  /**
    * The rule to update.
    */
  var rule: Rule = js.native
}

object UpdateRuleMetadataRequest {
  @scala.inline
  def apply(description: description, rule: Rule): UpdateRuleMetadataRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleMetadataRequest]
  }
}

