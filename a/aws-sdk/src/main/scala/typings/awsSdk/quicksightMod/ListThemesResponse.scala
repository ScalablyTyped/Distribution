package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThemesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  
  /**
    * Information about the themes in the list.
    */
  var ThemeSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.ThemeSummaryList] = js.native
}
object ListThemesResponse {
  
  @scala.inline
  def apply(): ListThemesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThemesResponse]
  }
  
  @scala.inline
  implicit class ListThemesResponseMutableBuilder[Self <: ListThemesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setThemeSummaryList(value: ThemeSummaryList): Self = StObject.set(x, "ThemeSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeSummaryListUndefined: Self = StObject.set(x, "ThemeSummaryList", js.undefined)
    
    @scala.inline
    def setThemeSummaryListVarargs(value: ThemeSummary*): Self = StObject.set(x, "ThemeSummaryList", js.Array(value :_*))
  }
}
