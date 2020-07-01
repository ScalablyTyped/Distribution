package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFilterRequest extends js.Object {
  /**
    * The ARN of the filter to describe.
    */
  var filterArn: Arn = js.native
}

object DescribeFilterRequest {
  @scala.inline
  def apply(filterArn: Arn): DescribeFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFilterRequest]
  }
}

