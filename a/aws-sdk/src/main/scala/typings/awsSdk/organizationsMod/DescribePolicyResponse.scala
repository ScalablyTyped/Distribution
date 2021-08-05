package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the specified policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.organizationsMod.Policy] = js.undefined
}
object DescribePolicyResponse {
  
  inline def apply(): DescribePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePolicyResponse]
  }
  
  extension [Self <: DescribePolicyResponse](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
