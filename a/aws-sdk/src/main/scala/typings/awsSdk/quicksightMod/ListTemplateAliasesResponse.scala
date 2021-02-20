package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTemplateAliasesResponse extends StObject {
  
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
    * A structure containing the list of the template's aliases.
    */
  var TemplateAliasList: js.UndefOr[typings.awsSdk.quicksightMod.TemplateAliasList] = js.native
}
object ListTemplateAliasesResponse {
  
  @scala.inline
  def apply(): ListTemplateAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateAliasesResponse]
  }
  
  @scala.inline
  implicit class ListTemplateAliasesResponseMutableBuilder[Self <: ListTemplateAliasesResponse] (val x: Self) extends AnyVal {
    
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
    def setTemplateAliasList(value: TemplateAliasList): Self = StObject.set(x, "TemplateAliasList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateAliasListUndefined: Self = StObject.set(x, "TemplateAliasList", js.undefined)
    
    @scala.inline
    def setTemplateAliasListVarargs(value: TemplateAlias*): Self = StObject.set(x, "TemplateAliasList", js.Array(value :_*))
  }
}
