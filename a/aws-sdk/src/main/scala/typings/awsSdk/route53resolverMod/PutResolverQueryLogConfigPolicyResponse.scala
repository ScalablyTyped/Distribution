package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResolverQueryLogConfigPolicyResponse extends StObject {
  
  /**
    * Whether the PutResolverQueryLogConfigPolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}
object PutResolverQueryLogConfigPolicyResponse {
  
  @scala.inline
  def apply(): PutResolverQueryLogConfigPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResolverQueryLogConfigPolicyResponse]
  }
  
  @scala.inline
  implicit class PutResolverQueryLogConfigPolicyResponseMutableBuilder[Self <: PutResolverQueryLogConfigPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
