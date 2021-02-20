package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThemeVersionsResponse extends StObject {
  
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
    * A structure containing a list of all the versions of the specified theme.
    */
  var ThemeVersionSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.ThemeVersionSummaryList] = js.native
}
object ListThemeVersionsResponse {
  
  @scala.inline
  def apply(): ListThemeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThemeVersionsResponse]
  }
  
  @scala.inline
  implicit class ListThemeVersionsResponseMutableBuilder[Self <: ListThemeVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setThemeVersionSummaryList(value: ThemeVersionSummaryList): Self = StObject.set(x, "ThemeVersionSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeVersionSummaryListUndefined: Self = StObject.set(x, "ThemeVersionSummaryList", js.undefined)
    
    @scala.inline
    def setThemeVersionSummaryListVarargs(value: ThemeVersionSummary*): Self = StObject.set(x, "ThemeVersionSummaryList", js.Array(value :_*))
  }
}
