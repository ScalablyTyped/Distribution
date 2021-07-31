package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    * The ARN of the secret retrieved by the resource-based policy.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The friendly name of the secret that the retrieved by the resource-based policy.
    */
  var Name: js.UndefOr[NameType] = js.undefined
}
object PutResourcePolicyResponse {
  
  @scala.inline
  def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class PutResourcePolicyResponseMutableBuilder[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: NameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
