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
  var ruleVersion: js.UndefOr[nonEmptyString] = js.native
}

object GetRulesRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    maxResults: Int | Double = null,
    nextToken: String = null,
    ruleId: identifier = null,
    ruleVersion: nonEmptyString = null
  ): GetRulesRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (ruleVersion != null) __obj.updateDynamic("ruleVersion")(ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRulesRequest]
  }
}

