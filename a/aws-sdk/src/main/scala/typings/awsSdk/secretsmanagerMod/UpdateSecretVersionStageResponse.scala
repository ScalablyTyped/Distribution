package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSecretVersionStageResponse extends StObject {
  
  /**
    * The ARN of the secret with the modified staging label.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The friendly name of the secret with the modified staging label.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
}
object UpdateSecretVersionStageResponse {
  
  @scala.inline
  def apply(): UpdateSecretVersionStageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecretVersionStageResponse]
  }
  
  @scala.inline
  implicit class UpdateSecretVersionStageResponseMutableBuilder[Self <: UpdateSecretVersionStageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
