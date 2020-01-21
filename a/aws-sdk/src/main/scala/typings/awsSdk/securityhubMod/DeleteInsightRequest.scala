package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInsightRequest extends js.Object {
  /**
    * The ARN of the insight to delete.
    */
  var InsightArn: NonEmptyString = js.native
}

object DeleteInsightRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): DeleteInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteInsightRequest]
  }
}

