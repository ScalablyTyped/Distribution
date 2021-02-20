package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketPolicyOutput extends StObject {
  
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: js.UndefOr[typings.awsSdk.s3Mod.Policy] = js.native
}
object GetBucketPolicyOutput {
  
  @scala.inline
  def apply(): GetBucketPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketPolicyOutput]
  }
  
  @scala.inline
  implicit class GetBucketPolicyOutputMutableBuilder[Self <: GetBucketPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
