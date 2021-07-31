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
  
  @scala.inline
  def apply(): ListOriginRequestPoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginRequestPoliciesResult]
  }
  
  @scala.inline
  implicit class ListOriginRequestPoliciesResultMutableBuilder[Self <: ListOriginRequestPoliciesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginRequestPolicyList(value: OriginRequestPolicyList): Self = StObject.set(x, "OriginRequestPolicyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginRequestPolicyListUndefined: Self = StObject.set(x, "OriginRequestPolicyList", js.undefined)
  }
}
