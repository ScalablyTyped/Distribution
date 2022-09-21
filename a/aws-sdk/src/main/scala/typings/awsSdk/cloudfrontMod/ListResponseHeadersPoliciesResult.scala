package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResponseHeadersPoliciesResult extends StObject {
  
  /**
    * A list of response headers policies.
    */
  var ResponseHeadersPolicyList: js.UndefOr[typings.awsSdk.cloudfrontMod.ResponseHeadersPolicyList] = js.undefined
}
object ListResponseHeadersPoliciesResult {
  
  inline def apply(): ListResponseHeadersPoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResponseHeadersPoliciesResult]
  }
  
  extension [Self <: ListResponseHeadersPoliciesResult](x: Self) {
    
    inline def setResponseHeadersPolicyList(value: ResponseHeadersPolicyList): Self = StObject.set(x, "ResponseHeadersPolicyList", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersPolicyListUndefined: Self = StObject.set(x, "ResponseHeadersPolicyList", js.undefined)
  }
}
