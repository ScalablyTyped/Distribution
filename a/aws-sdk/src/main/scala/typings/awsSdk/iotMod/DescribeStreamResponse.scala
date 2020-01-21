package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamResponse extends js.Object {
  /**
    * Information about the stream.
    */
  var streamInfo: js.UndefOr[StreamInfo] = js.native
}

object DescribeStreamResponse {
  @scala.inline
  def apply(streamInfo: StreamInfo = null): DescribeStreamResponse = {
    val __obj = js.Dynamic.literal()
    if (streamInfo != null) __obj.updateDynamic("streamInfo")(streamInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamResponse]
  }
}

