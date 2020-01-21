package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListS3ResourcesRequest extends js.Object {
  /**
    * Use this parameter to indicate the maximum number of items that you want in the response. The default value is 250. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The Amazon Macie member account ID whose associated S3 resources you want to list. 
    */
  var memberAccountId: js.UndefOr[AWSAccountId] = js.native
  /**
    * Use this parameter when paginating results. Set its value to null on your first call to the ListS3Resources action. Subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListS3ResourcesRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, memberAccountId: AWSAccountId = null, nextToken: NextToken = null): ListS3ResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListS3ResourcesRequest]
  }
}

