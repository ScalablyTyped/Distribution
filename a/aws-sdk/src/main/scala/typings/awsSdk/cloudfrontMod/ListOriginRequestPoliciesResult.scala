package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOriginRequestPoliciesResult extends StObject {
  
  /**
    * A list of origin request policies.
    */
  var OriginRequestPolicyList: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicyList] = js.undefined
}
object ListOriginRequestPoliciesResult {
  
  inline def apply(): ListOriginRequestPoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginRequestPoliciesResult]
  }
  
  extension [Self <: ListOriginRequestPoliciesResult](x: Self) {
    
    inline def setOriginRequestPolicyList(value: OriginRequestPolicyList): Self = StObject.set(x, "OriginRequestPolicyList", value.asInstanceOf[js.Any])
    
    inline def setOriginRequestPolicyListUndefined: Self = StObject.set(x, "OriginRequestPolicyList", js.undefined)
  }
}
