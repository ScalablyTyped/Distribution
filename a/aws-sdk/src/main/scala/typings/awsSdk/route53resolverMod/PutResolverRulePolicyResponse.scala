package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResolverRulePolicyResponse extends StObject {
  
  /**
    * Whether the PutResolverRulePolicy request was successful.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.undefined
}
object PutResolverRulePolicyResponse {
  
  @scala.inline
  def apply(): PutResolverRulePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResolverRulePolicyResponse]
  }
  
  @scala.inline
  implicit class PutResolverRulePolicyResponseMutableBuilder[Self <: PutResolverRulePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "ReturnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "ReturnValue", js.undefined)
  }
}
