package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyResponse extends StObject {
  
  /**
    * The ARN of the secret that the resource-based policy was deleted for.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The friendly name of the secret that the resource-based policy was deleted for.
    */
  var Name: js.UndefOr[NameType] = js.undefined
}
object DeleteResourcePolicyResponse {
  
  @scala.inline
  def apply(): DeleteResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyResponse]
  }
  
  @scala.inline
  implicit class DeleteResourcePolicyResponseMutableBuilder[Self <: DeleteResourcePolicyResponse] (val x: Self) extends AnyVal {
    
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
