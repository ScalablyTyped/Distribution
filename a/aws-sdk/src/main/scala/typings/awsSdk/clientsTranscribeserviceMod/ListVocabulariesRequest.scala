package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVocabulariesRequest extends StObject {
  
  /**
    * The maximum number of custom vocabularies to return in each page of results. If there are fewer results than the value you specify, only the actual results are returned. If you don't specify a value, a default of 5 is used.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.MaxResults] = js.undefined
  
  /**
    * Returns only the custom vocabularies that contain the specified string. The search is not case sensitive.
    */
  var NameContains: js.UndefOr[VocabularyName] = js.undefined
  
  /**
    * If your ListVocabularies request returns more results than can be displayed, NextToken is displayed in the response with an associated string. To get the next page of results, copy this string and repeat your request, including NextToken with the value of the copied string. Repeat as needed to view all your results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTranscribeserviceMod.NextToken] = js.undefined
  
  /**
    * Returns only custom vocabularies with the specified state. Vocabularies are ordered by creation date, with the newest vocabulary first. If you don't include StateEquals, all custom medical vocabularies are returned.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.undefined
}
object ListVocabulariesRequest {
  
  inline def apply(): ListVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesRequest]
  }
  
  extension [Self <: ListVocabulariesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameContains(value: VocabularyName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    inline def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStateEquals(value: VocabularyState): Self = StObject.set(x, "StateEquals", value.asInstanceOf[js.Any])
    
    inline def setStateEqualsUndefined: Self = StObject.set(x, "StateEquals", js.undefined)
  }
}
