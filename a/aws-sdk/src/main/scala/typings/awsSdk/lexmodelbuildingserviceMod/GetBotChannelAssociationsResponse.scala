package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotChannelAssociationsResponse extends StObject {
  
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
  implicit class GetBotChannelAssociationsResponseMutableBuilder[Self <: GetBotChannelAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBotChannelAssociations(value: BotChannelAssociationList): Self = StObject.set(x, "botChannelAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBotChannelAssociationsUndefined: Self = StObject.set(x, "botChannelAssociations", js.undefined)
    
    @scala.inline
    def setBotChannelAssociationsVarargs(value: BotChannelAssociation*): Self = StObject.set(x, "botChannelAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
