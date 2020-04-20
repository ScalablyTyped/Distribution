package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventTrackerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the event tracker to describe.
    */
  var eventTrackerArn: Arn = js.native
}

object DescribeEventTrackerRequest {
  @scala.inline
  def apply(eventTrackerArn: Arn): DescribeEventTrackerRequest = {
    val __obj = js.Dynamic.literal(eventTrackerArn = eventTrackerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventTrackerRequest]
  }
}

