package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePartnerEventSourceRequest extends js.Object {
  /**
    * The name of the event source to display.
    */
  var Name: EventSourceName = js.native
}

object DescribePartnerEventSourceRequest {
  @scala.inline
  def apply(Name: EventSourceName): DescribePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePartnerEventSourceRequest]
  }
}

