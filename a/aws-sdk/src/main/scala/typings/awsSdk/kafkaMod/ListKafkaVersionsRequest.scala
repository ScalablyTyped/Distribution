package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKafkaVersionsRequest extends js.Object {
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.kafkaMod.MaxResults] = js.native
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. To get the next batch, provide this token in your next request.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListKafkaVersionsRequest {
  @scala.inline
  def apply(MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: string = null): ListKafkaVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKafkaVersionsRequest]
  }
}

