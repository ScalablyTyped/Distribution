package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotChannelAssociationsResponse extends js.Object {
  
  /**
    * An array of objects, one for each association, that provides information about the Amazon Lex bot and its association with the channel. 
    */
  var botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.native
  
  /**
    * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object GetBotChannelAssociationsResponse {
  
  @scala.inline
  def apply(): GetBotChannelAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotChannelAssociationsResponse]
  }
  
  @scala.inline
  implicit class GetBotChannelAssociationsResponseOps[Self <: GetBotChannelAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setBotChannelAssociationsVarargs(value: BotChannelAssociation*): Self = this.set("botChannelAssociations", js.Array(value :_*))
    
    @scala.inline
    def setBotChannelAssociations(value: BotChannelAssociationList): Self = this.set("botChannelAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotChannelAssociations: Self = this.set("botChannelAssociations", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
