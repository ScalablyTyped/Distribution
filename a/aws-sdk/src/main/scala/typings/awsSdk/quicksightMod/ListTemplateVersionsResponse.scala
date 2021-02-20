package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplateVersionsResponse extends StObject {
  
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
    * A structure containing a list of all the versions of the specified template.
    */
  var TemplateVersionSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.TemplateVersionSummaryList] = js.native
}
object ListTemplateVersionsResponse {
  
  @scala.inline
  def apply(): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  
  @scala.inline
  implicit class ListTemplateVersionsResponseMutableBuilder[Self <: ListTemplateVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplateVersionSummaryList(value: TemplateVersionSummaryList): Self = StObject.set(x, "TemplateVersionSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateVersionSummaryListUndefined: Self = StObject.set(x, "TemplateVersionSummaryList", js.undefined)
    
    @scala.inline
    def setTemplateVersionSummaryListVarargs(value: TemplateVersionSummary*): Self = StObject.set(x, "TemplateVersionSummaryList", js.Array(value :_*))
  }
}
