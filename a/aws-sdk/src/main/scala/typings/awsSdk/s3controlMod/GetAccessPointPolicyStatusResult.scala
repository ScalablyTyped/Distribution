package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyStatusResult extends StObject {
  
  /**
    * Indicates the current policy status of the specified access point.
    */
  var PolicyStatus: js.UndefOr[typings.awsSdk.s3controlMod.PolicyStatus] = js.undefined
}
object GetAccessPointPolicyStatusResult {
  
  @scala.inline
  def apply(): GetAccessPointPolicyStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessPointPolicyStatusResult]
  }
  
  @scala.inline
  implicit class GetAccessPointPolicyStatusResultMutableBuilder[Self <: GetAccessPointPolicyStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyStatus(value: PolicyStatus): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
  }
}
