package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectivePolicy extends StObject {
  
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  
  /**
    * The IAM policy document.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
}
object EffectivePolicy {
  
  @scala.inline
  def apply(): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePolicy]
  }
  
  @scala.inline
  implicit class EffectivePolicyMutableBuilder[Self <: EffectivePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
