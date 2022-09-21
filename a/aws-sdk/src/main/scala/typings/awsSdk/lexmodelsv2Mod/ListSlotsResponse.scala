package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSlotsResponse extends StObject {
  
  /**
    * The identifier of the bot that contains the slots.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot that contains the slots.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The identifier of the intent that contains the slots.
    */
  var intentId: js.UndefOr[Id] = js.undefined
  
  /**
    * The language and locale of the slots in the list.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListSlots operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListSlots operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Summary information for the slots that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more slots available, the nextToken field contains a token to get the next page of results.
    */
  var slotSummaries: js.UndefOr[SlotSummaryList] = js.undefined
}
object ListSlotsResponse {
  
  inline def apply(): ListSlotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSlotsResponse]
  }
  
  extension [Self <: ListSlotsResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setIntentIdUndefined: Self = StObject.set(x, "intentId", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSlotSummaries(value: SlotSummaryList): Self = StObject.set(x, "slotSummaries", value.asInstanceOf[js.Any])
    
    inline def setSlotSummariesUndefined: Self = StObject.set(x, "slotSummaries", js.undefined)
    
    inline def setSlotSummariesVarargs(value: SlotSummary*): Self = StObject.set(x, "slotSummaries", js.Array(value*))
  }
}
