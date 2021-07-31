package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSecretResponse extends StObject {
  
  /**
    * The ARN of the secret that was restored.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The friendly name of the secret that was restored.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
}
object RestoreSecretResponse {
  
  @scala.inline
  def apply(): RestoreSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreSecretResponse]
  }
  
  @scala.inline
  implicit class RestoreSecretResponseMutableBuilder[Self <: RestoreSecretResponse] (val x: Self) extends AnyVal {
    
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
