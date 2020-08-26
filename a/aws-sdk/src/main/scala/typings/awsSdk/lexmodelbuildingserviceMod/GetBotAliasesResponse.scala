package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotAliasesResponse extends js.Object {
  /**
    * An array of BotAliasMetadata objects, each describing a bot alias.
    */
  var BotAliases: js.UndefOr[BotAliasMetadataList] = js.native
  /**
    * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBotAliasesResponse {
  @scala.inline
  def apply(): GetBotAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotAliasesResponse]
  }
  @scala.inline
  implicit class GetBotAliasesResponseOps[Self <: GetBotAliasesResponse] (val x: Self) extends AnyVal {
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
    def setBotAliasesVarargs(value: BotAliasMetadata*): Self = this.set("BotAliases", js.Array(value :_*))
    @scala.inline
    def setBotAliases(value: BotAliasMetadataList): Self = this.set("BotAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotAliases: Self = this.set("BotAliases", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

