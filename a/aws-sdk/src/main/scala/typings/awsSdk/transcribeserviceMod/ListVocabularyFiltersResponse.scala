package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVocabularyFiltersResponse extends StObject {
  
  /**
    * The ListVocabularyFilters operation returns a page of collections at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListVocabularyFilters operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typings.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * The list of vocabulary filters. It contains at most MaxResults number of filters. If there are more filters, call the ListVocabularyFilters operation again with the NextToken parameter in the request set to the value of the NextToken field in the response.
    */
  var VocabularyFilters: js.UndefOr[typings.awsSdk.transcribeserviceMod.VocabularyFilters] = js.native
}
object ListVocabularyFiltersResponse {
  
  @scala.inline
  def apply(): ListVocabularyFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVocabularyFiltersResponse]
  }
  
  @scala.inline
  implicit class ListVocabularyFiltersResponseMutableBuilder[Self <: ListVocabularyFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVocabularyFilters(value: VocabularyFilters): Self = StObject.set(x, "VocabularyFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVocabularyFiltersUndefined: Self = StObject.set(x, "VocabularyFilters", js.undefined)
    
    @scala.inline
    def setVocabularyFiltersVarargs(value: VocabularyFilterInfo*): Self = StObject.set(x, "VocabularyFilters", js.Array(value :_*))
  }
}
