package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamProcessorsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * List of stream processors that you have created.
    */
  var StreamProcessors: js.UndefOr[StreamProcessorList] = js.native
}

object ListStreamProcessorsResponse {
  @scala.inline
  def apply(NextToken: PaginationToken = null, StreamProcessors: StreamProcessorList = null): ListStreamProcessorsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StreamProcessors != null) __obj.updateDynamic("StreamProcessors")(StreamProcessors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamProcessorsResponse]
  }
}

