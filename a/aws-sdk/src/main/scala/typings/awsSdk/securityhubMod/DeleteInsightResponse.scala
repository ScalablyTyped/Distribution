package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInsightResponse extends js.Object {
  /**
    * The ARN of the insight that was deleted.
    */
  var InsightArn: NonEmptyString = js.native
}

object DeleteInsightResponse {
  @scala.inline
  def apply(InsightArn: NonEmptyString): DeleteInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightResponse]
  }
}

