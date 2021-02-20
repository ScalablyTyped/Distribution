package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePolicyResponse extends StObject {
  
  /**
    * A structure that contains details about the specified policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.organizationsMod.Policy] = js.native
}
object DescribePolicyResponse {
  
  @scala.inline
  def apply(): DescribePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePolicyResponse]
  }
  
  @scala.inline
  implicit class DescribePolicyResponseMutableBuilder[Self <: DescribePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
