package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAssociatedTranscriptsResponse extends StObject {
  
  /**
    * The object that contains the associated transcript that meet the criteria you specified.
    */
  var associatedTranscripts: js.UndefOr[AssociatedTranscriptList] = js.undefined
  
  /**
    * The unique identifier of the bot associated with the transcripts that you are searching.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    *  The unique identifier of the bot recommendation associated with the transcripts to search.
    */
  var botRecommendationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot containing the transcripts that you are searching.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The identifier of the language and locale of the transcripts to search. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A index that indicates whether there are more results to return in a response to the SearchAssociatedTranscripts operation. If the nextIndex field is present, you send the contents as the nextIndex parameter of a SearchAssociatedTranscriptsRequest operation to get the next page of results.
    */
  var nextIndex: js.UndefOr[NextIndex] = js.undefined
  
  /**
    * The total number of transcripts returned by the search.
    */
  var totalResults: js.UndefOr[MaxResults] = js.undefined
}
object SearchAssociatedTranscriptsResponse {
  
  inline def apply(): SearchAssociatedTranscriptsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAssociatedTranscriptsResponse]
  }
  
  extension [Self <: SearchAssociatedTranscriptsResponse](x: Self) {
    
    inline def setAssociatedTranscripts(value: AssociatedTranscriptList): Self = StObject.set(x, "associatedTranscripts", value.asInstanceOf[js.Any])
    
    inline def setAssociatedTranscriptsUndefined: Self = StObject.set(x, "associatedTranscripts", js.undefined)
    
    inline def setAssociatedTranscriptsVarargs(value: AssociatedTranscript*): Self = StObject.set(x, "associatedTranscripts", js.Array(value*))
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationIdUndefined: Self = StObject.set(x, "botRecommendationId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextIndex(value: NextIndex): Self = StObject.set(x, "nextIndex", value.asInstanceOf[js.Any])
    
    inline def setNextIndexUndefined: Self = StObject.set(x, "nextIndex", js.undefined)
    
    inline def setTotalResults(value: MaxResults): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
