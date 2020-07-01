package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeReviewRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: Arn = js.native
}

object DescribeCodeReviewRequest {
  @scala.inline
  def apply(CodeReviewArn: Arn): DescribeCodeReviewRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeReviewRequest]
  }
}

