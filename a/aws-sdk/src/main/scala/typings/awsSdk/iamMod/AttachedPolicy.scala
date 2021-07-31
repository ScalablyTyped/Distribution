package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedPolicy extends StObject {
  
  var PolicyArn: js.UndefOr[arnType] = js.undefined
  
  /**
    * The friendly name of the attached policy.
    */
  var PolicyName: js.UndefOr[policyNameType] = js.undefined
}
object AttachedPolicy {
  
  @scala.inline
  def apply(): AttachedPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPolicy]
  }
  
  @scala.inline
  implicit class AttachedPolicyMutableBuilder[Self <: AttachedPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "PolicyArn", js.undefined)
    
    @scala.inline
    def setPolicyName(value: policyNameType): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
  }
}
