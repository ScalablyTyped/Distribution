package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRulesRequest extends js.Object {
  /**
    * The detector ID.
    */
  var detectorId: identifier = js.native
  /**
    * The maximum number of rules to return for the request.
    */
  var maxResults: js.UndefOr[RulesMaxResults] = js.native
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.native
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.native
}

object GetRulesRequest {
  @scala.inline
  def apply(detectorId: identifier): GetRulesRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRulesRequest]
  }
  @scala.inline
  implicit class GetRulesRequestOps[Self <: GetRulesRequest] (val x: Self) extends AnyVal {
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
    def setDetectorId(value: identifier): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: RulesMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRuleId(value: identifier): Self = this.set("ruleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleId: Self = this.set("ruleId", js.undefined)
    @scala.inline
    def setRuleVersion(value: wholeNumberVersionString): Self = this.set("ruleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleVersion: Self = this.set("ruleVersion", js.undefined)
  }
  
}

