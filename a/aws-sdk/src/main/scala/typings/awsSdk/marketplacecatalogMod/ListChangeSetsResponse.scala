package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangeSetsResponse extends StObject {
  
  /**
    *  Array of ChangeSetSummaryListItem objects.
    */
  var ChangeSetSummaryList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.ChangeSetSummaryList] = js.undefined
  
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.undefined
}
object ListChangeSetsResponse {
  
  @scala.inline
  def apply(): ListChangeSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChangeSetsResponse]
  }
  
  @scala.inline
  implicit class ListChangeSetsResponseMutableBuilder[Self <: ListChangeSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSetSummaryList(value: ChangeSetSummaryList): Self = StObject.set(x, "ChangeSetSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSetSummaryListUndefined: Self = StObject.set(x, "ChangeSetSummaryList", js.undefined)
    
    @scala.inline
    def setChangeSetSummaryListVarargs(value: ChangeSetSummaryListItem*): Self = StObject.set(x, "ChangeSetSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
