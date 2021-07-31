package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelRotateSecretResponse extends StObject {
  
  /**
    * The ARN of the secret for which rotation was canceled.
    */
  var ARN: js.UndefOr[SecretARNType] = js.undefined
  
  /**
    * The friendly name of the secret for which rotation was canceled.
    */
  var Name: js.UndefOr[SecretNameType] = js.undefined
  
  /**
    * The unique identifier of the version of the secret created during the rotation. This version might not be complete, and should be evaluated for possible deletion. At the very least, you should remove the VersionStage value AWSPENDING to enable this version to be deleted. Failing to clean up a cancelled rotation can block you from successfully starting future rotations.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
}
object CancelRotateSecretResponse {
  
  @scala.inline
  def apply(): CancelRotateSecretResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelRotateSecretResponse]
  }
  
  @scala.inline
  implicit class CancelRotateSecretResponseMutableBuilder[Self <: CancelRotateSecretResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: SecretARNType): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setName(value: SecretNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
