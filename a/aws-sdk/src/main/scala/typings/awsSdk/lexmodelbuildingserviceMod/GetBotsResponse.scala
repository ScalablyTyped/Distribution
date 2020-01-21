package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotsResponse extends js.Object {
  /**
    * An array of botMetadata objects, with one entry for each bot. 
    */
  var bots: js.UndefOr[BotMetadataList] = js.native
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of bots. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBotsResponse {
  @scala.inline
  def apply(bots: BotMetadataList = null, nextToken: NextToken = null): GetBotsResponse = {
    val __obj = js.Dynamic.literal()
    if (bots != null) __obj.updateDynamic("bots")(bots.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotsResponse]
  }
}

