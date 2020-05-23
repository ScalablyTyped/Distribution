package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotChannelAssociationsRequest extends js.Object {
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasNameOrListAll = js.native
  /**
    * The name of the Amazon Lex bot in the association.
    */
  var botName: BotName = js.native
  /**
    * The maximum number of associations to return in the response. The default is 50. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * Substring to match in channel association names. An association will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To return all bot channel associations, use a hyphen ("-") as the nameContains parameter.
    */
  var nameContains: js.UndefOr[BotChannelName] = js.native
  /**
    * A pagination token for fetching the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBotChannelAssociationsRequest {
  @scala.inline
  def apply(
    botAlias: AliasNameOrListAll,
    botName: BotName,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nameContains: BotChannelName = null,
    nextToken: NextToken = null
  ): GetBotChannelAssociationsRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nameContains != null) __obj.updateDynamic("nameContains")(nameContains.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotChannelAssociationsRequest]
  }
}

