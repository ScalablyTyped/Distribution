package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyDetail extends StObject {
  
  /**
    * The policy document.
    */
  var PolicyDocument: js.UndefOr[policyDocumentType] = js.undefined
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
}
object PolicyDetail {
  
  @scala.inline
  def apply(): PolicyDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDetail]
  }
  
  @scala.inline
  implicit class PolicyDetailMutableBuilder[Self <: PolicyDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDocument(value: policyDocumentType): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
