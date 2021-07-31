package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketPolicyResult extends StObject {
  
  /**
    * The policy of the Outposts bucket.
    */
  var Policy: js.UndefOr[typings.awsSdk.s3controlMod.Policy] = js.undefined
}
object GetBucketPolicyResult {
  
  @scala.inline
  def apply(): GetBucketPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyResult]
  }
  
  @scala.inline
  implicit class GetBucketPolicyResultMutableBuilder[Self <: GetBucketPolicyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
