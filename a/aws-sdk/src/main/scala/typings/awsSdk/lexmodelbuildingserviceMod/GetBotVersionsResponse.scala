package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotVersionsResponse extends js.Object {
  
  /**
    * An array of BotMetadata objects, one for each numbered version of the bot plus one for the $LATEST version.
    */
  var bots: js.UndefOr[BotMetadataList] = js.native
  
  /**
    * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetBotVersionsResponse {
  
  @scala.inline
  def apply(): GetBotVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotVersionsResponse]
  }
  
  @scala.inline
  implicit class GetBotVersionsResponseOps[Self <: GetBotVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setBotsVarargs(value: BotMetadata*): Self = this.set("bots", js.Array(value :_*))
    
    @scala.inline
    def setBots(value: BotMetadataList): Self = this.set("bots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBots: Self = this.set("bots", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
