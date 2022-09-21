package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecretVersionStageResponse extends StObject {
  
  /**
    * The ARN of the secret that was updated.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The name of the secret that was updated.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
}
object UpdateSecretVersionStageResponse {
  
  inline def apply(): UpdateSecretVersionStageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecretVersionStageResponse]
  }
  
  extension [Self <: UpdateSecretVersionStageResponse](x: Self) {
    
    inline def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
