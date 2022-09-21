package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotChannelAssociationsResponse extends StObject {
  
  /**
    * An array of objects, one for each association, that provides information about the Amazon Lex bot and its association with the channel. 
    */
  var botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.undefined
  
  /**
    * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotChannelAssociationsResponse {
  
  inline def apply(): GetBotChannelAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotChannelAssociationsResponse]
  }
  
  extension [Self <: GetBotChannelAssociationsResponse](x: Self) {
    
    inline def setBotChannelAssociations(value: BotChannelAssociationList): Self = StObject.set(x, "botChannelAssociations", value.asInstanceOf[js.Any])
    
    inline def setBotChannelAssociationsUndefined: Self = StObject.set(x, "botChannelAssociations", js.undefined)
    
    inline def setBotChannelAssociationsVarargs(value: BotChannelAssociation*): Self = StObject.set(x, "botChannelAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
