package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLexBotsResponse extends js.Object {
  
  /**
    * The the names and regions of the Amazon Lex bots associated with the specified instance.
    */
  var LexBots: js.UndefOr[LexBotsList] = js.native
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}
object ListLexBotsResponse {
  
  @scala.inline
  def apply(): ListLexBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexBotsResponse]
  }
  
  @scala.inline
  implicit class ListLexBotsResponseOps[Self <: ListLexBotsResponse] (val x: Self) extends AnyVal {
    
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
    def setLexBotsVarargs(value: LexBot*): Self = this.set("LexBots", js.Array(value :_*))
    
    @scala.inline
    def setLexBots(value: LexBotsList): Self = this.set("LexBots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLexBots: Self = this.set("LexBots", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
