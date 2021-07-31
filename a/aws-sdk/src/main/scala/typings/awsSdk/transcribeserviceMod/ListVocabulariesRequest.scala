package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVocabulariesRequest extends StObject {
  
  /**
    * The maximum number of vocabularies to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.transcribeserviceMod.MaxResults] = js.undefined
  
  /**
    * When specified, the vocabularies returned in the list are limited to vocabularies whose name contains the specified string. The search is not case sensitive, ListVocabularies returns both "vocabularyname" and "VocabularyName" in the response list.
    */
  var NameContains: js.UndefOr[VocabularyName] = js.undefined
  
  /**
    * If the result of the previous request to ListVocabularies was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.undefined
  
  /**
    * When specified, only returns vocabularies with the VocabularyState field equal to the specified state.
    */
  var StateEquals: js.UndefOr[VocabularyState] = js.undefined
}
object ListVocabulariesRequest {
  
  @scala.inline
  def apply(): ListVocabulariesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabulariesRequest]
  }
  
  @scala.inline
  implicit class ListVocabulariesRequestMutableBuilder[Self <: ListVocabulariesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNameContains(value: VocabularyName): Self = StObject.set(x, "NameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameContainsUndefined: Self = StObject.set(x, "NameContains", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStateEquals(value: VocabularyState): Self = StObject.set(x, "StateEquals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateEqualsUndefined: Self = StObject.set(x, "StateEquals", js.undefined)
  }
}
