package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelRequest extends js.Object {
  /**
    * The ID of a Channel.
    */
  var Id: string = js.native
}

object DescribeChannelRequest {
  @scala.inline
  def apply(Id: string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

