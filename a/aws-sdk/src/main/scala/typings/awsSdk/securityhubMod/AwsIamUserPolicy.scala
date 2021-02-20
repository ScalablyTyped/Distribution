package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamUserPolicy extends StObject {
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamUserPolicy {
  
  @scala.inline
  def apply(): AwsIamUserPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamUserPolicy]
  }
  
  @scala.inline
  implicit class AwsIamUserPolicyMutableBuilder[Self <: AwsIamUserPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
