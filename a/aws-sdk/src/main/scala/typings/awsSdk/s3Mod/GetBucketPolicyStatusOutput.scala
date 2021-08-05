package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketPolicyStatusOutput extends StObject {
  
  /**
    * The policy status for the specified bucket.
    */
  var PolicyStatus: js.UndefOr[typings.awsSdk.s3Mod.PolicyStatus] = js.undefined
}
object GetBucketPolicyStatusOutput {
  
  inline def apply(): GetBucketPolicyStatusOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyStatusOutput]
  }
  
  extension [Self <: GetBucketPolicyStatusOutput](x: Self) {
    
    inline def setPolicyStatus(value: PolicyStatus): Self = StObject.set(x, "PolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setPolicyStatusUndefined: Self = StObject.set(x, "PolicyStatus", js.undefined)
  }
}
