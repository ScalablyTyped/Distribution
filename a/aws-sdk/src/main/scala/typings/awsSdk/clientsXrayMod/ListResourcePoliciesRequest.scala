package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcePoliciesRequest extends StObject {
  
  /**
    * Not currently supported.
    */
  var NextToken: js.UndefOr[ResourcePolicyNextToken] = js.undefined
}
object ListResourcePoliciesRequest {
  
  inline def apply(): ListResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcePoliciesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourcePoliciesRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: ResourcePolicyNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
