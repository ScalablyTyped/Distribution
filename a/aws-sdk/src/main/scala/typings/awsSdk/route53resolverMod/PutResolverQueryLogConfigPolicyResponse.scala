package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResolverQueryLogConfigPolicyResponse extends StObject {
  
  /**
    * Whether the PutResolverQueryLogConfigPolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object PutResolverQueryLogConfigPolicyResponse {
  
  inline def apply(): PutResolverQueryLogConfigPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResolverQueryLogConfigPolicyResponse]
  }
  
  extension [Self <: PutResolverQueryLogConfigPolicyResponse](x: Self) {
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
