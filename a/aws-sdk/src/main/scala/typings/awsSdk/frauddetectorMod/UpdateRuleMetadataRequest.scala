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
  @scala.inline
  implicit class UpdateRuleMetadataRequestOps[Self <: UpdateRuleMetadataRequest] (val x: Self) extends AnyVal {
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
    def setDescription(value: description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setRule(value: Rule): Self = this.set("rule", value.asInstanceOf[js.Any])
  }
  
}

