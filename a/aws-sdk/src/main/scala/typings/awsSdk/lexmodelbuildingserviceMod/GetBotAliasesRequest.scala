package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotAliasesRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName = js.native
  /**
    * The maximum number of aliases to return in the response. The default is 50. . 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[AliasName] = js.native
  /**
    * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBotAliasesRequest {
  @scala.inline
  def apply(botName: BotName): GetBotAliasesRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotAliasesRequest]
  }
  @scala.inline
  implicit class GetBotAliasesRequestOps[Self <: GetBotAliasesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNameContains(value: AliasName): Self = this.set("nameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("nameContains", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

