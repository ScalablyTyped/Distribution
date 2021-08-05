package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromoteResourceShareCreatedFromPolicyResponse extends StObject {
  
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}
object PromoteResourceShareCreatedFromPolicyResponse {
  
  inline def apply(): PromoteResourceShareCreatedFromPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromoteResourceShareCreatedFromPolicyResponse]
  }
  
  extension [Self <: PromoteResourceShareCreatedFromPolicyResponse](x: Self) {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
