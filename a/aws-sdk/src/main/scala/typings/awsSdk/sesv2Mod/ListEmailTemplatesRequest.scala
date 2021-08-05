package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEmailTemplatesRequest extends StObject {
  
  /**
    * A token returned from a previous call to ListEmailTemplates to indicate the position in the list of email templates.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.undefined
  
  /**
    * The number of results to show in a single call to ListEmailTemplates. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 1, and can be no more than 10.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
}
object ListEmailTemplatesRequest {
  
  inline def apply(): ListEmailTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailTemplatesRequest]
  }
  
  extension [Self <: ListEmailTemplatesRequest](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
  }
}
