package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsIamGroupPolicy extends StObject {
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[NonEmptyString] = js.native
}
object AwsIamGroupPolicy {
  
  @scala.inline
  def apply(): AwsIamGroupPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamGroupPolicy]
  }
  
  @scala.inline
  implicit class AwsIamGroupPolicyMutableBuilder[Self <: AwsIamGroupPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: NonEmptyString): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
