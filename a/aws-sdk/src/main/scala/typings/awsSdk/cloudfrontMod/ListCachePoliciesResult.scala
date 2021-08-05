package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCachePoliciesResult extends StObject {
  
  /**
    * A list of cache policies.
    */
  var CachePolicyList: js.UndefOr[typings.awsSdk.cloudfrontMod.CachePolicyList] = js.undefined
}
object ListCachePoliciesResult {
  
  inline def apply(): ListCachePoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCachePoliciesResult]
  }
  
  extension [Self <: ListCachePoliciesResult](x: Self) {
    
    inline def setCachePolicyList(value: CachePolicyList): Self = StObject.set(x, "CachePolicyList", value.asInstanceOf[js.Any])
    
    inline def setCachePolicyListUndefined: Self = StObject.set(x, "CachePolicyList", js.undefined)
  }
}
