package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyResult extends StObject {
  
  /**
    * The access point policy associated with the specified access point.
    */
  var Policy: js.UndefOr[typings.awsSdk.s3controlMod.Policy] = js.undefined
}
object GetAccessPointPolicyResult {
  
  @scala.inline
  def apply(): GetAccessPointPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyResult]
  }
  
  @scala.inline
  implicit class GetAccessPointPolicyResultMutableBuilder[Self <: GetAccessPointPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
