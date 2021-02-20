package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSecretValueResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the secret for which you just created a version.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  
  /**
    * The friendly name of the secret for which you just created or updated a version.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  
  /**
    * The unique identifier of the version of the secret you just created or updated.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  
  /**
    * The list of staging labels that are currently attached to this version of the secret. Staging labels are used to track a version as it progresses through the secret rotation process.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}
object PutSecretValueResponse {
  
  @scala.inline
  def apply(): PutSecretValueResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSecretValueResponse]
  }
  
  @scala.inline
  implicit class PutSecretValueResponseMutableBuilder[Self <: PutSecretValueResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setVersionStages(value: SecretVersionStagesType): Self = StObject.set(x, "VersionStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionStagesUndefined: Self = StObject.set(x, "VersionStages", js.undefined)
    
    @scala.inline
    def setVersionStagesVarargs(value: SecretVersionStageType*): Self = StObject.set(x, "VersionStages", js.Array(value :_*))
  }
}
