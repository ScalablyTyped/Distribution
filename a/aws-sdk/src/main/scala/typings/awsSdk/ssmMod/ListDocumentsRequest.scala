package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDocumentsRequest extends StObject {
  
  /**
    * This data type is deprecated. Instead, use Filters.
    */
  var DocumentFilterList: js.UndefOr[typings.awsSdk.ssmMod.DocumentFilterList] = js.native
  
  /**
    * One or more DocumentKeyValuesFilter objects. Use a filter to return a more specific list of results. For keys, you can specify one or more key-value pair tags that have been applied to a document. Other valid keys include Owner, Name, PlatformTypes, DocumentType, and TargetType. For example, to return documents you own use Key=Owner,Values=Self. To specify a custom key-value pair, use the format Key=tag:tagName,Values=valueName.
    */
  var Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.native
  
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListDocumentsRequest {
  
  @scala.inline
  def apply(): ListDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDocumentsRequest]
  }
  
  @scala.inline
  implicit class ListDocumentsRequestMutableBuilder[Self <: ListDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentFilterList(value: DocumentFilterList): Self = StObject.set(x, "DocumentFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentFilterListUndefined: Self = StObject.set(x, "DocumentFilterList", js.undefined)
    
    @scala.inline
    def setDocumentFilterListVarargs(value: DocumentFilter*): Self = StObject.set(x, "DocumentFilterList", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: DocumentKeyValuesFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: DocumentKeyValuesFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
