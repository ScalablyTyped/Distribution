package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamRequest extends js.Object {
  /**
    * The stream ID.
    */
  var streamId: StreamId = js.native
}

object DescribeStreamRequest {
  @scala.inline
  def apply(streamId: StreamId): DescribeStreamRequest = {
    val __obj = js.Dynamic.literal(streamId = streamId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStreamRequest]
  }
}

