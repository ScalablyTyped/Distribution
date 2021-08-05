package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThemeAliasesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * A structure containing the list of the theme's aliases.
    */
  var ThemeAliasList: js.UndefOr[typings.awsSdk.quicksightMod.ThemeAliasList] = js.undefined
}
object ListThemeAliasesResponse {
  
  inline def apply(): ListThemeAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThemeAliasesResponse]
  }
  
  extension [Self <: ListThemeAliasesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setThemeAliasList(value: ThemeAliasList): Self = StObject.set(x, "ThemeAliasList", value.asInstanceOf[js.Any])
    
    inline def setThemeAliasListUndefined: Self = StObject.set(x, "ThemeAliasList", js.undefined)
    
    inline def setThemeAliasListVarargs(value: ThemeAlias*): Self = StObject.set(x, "ThemeAliasList", js.Array(value :_*))
  }
}
