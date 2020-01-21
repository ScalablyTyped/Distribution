package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChannelRequest extends js.Object {
  /**
    * channel ID
    */
  var ChannelId: string = js.native
}

object DescribeChannelRequest {
  @scala.inline
  def apply(ChannelId: string): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeChannelRequest]
  }
}

