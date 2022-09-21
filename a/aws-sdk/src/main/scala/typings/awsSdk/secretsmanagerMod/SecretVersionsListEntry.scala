package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretVersionsListEntry extends StObject {
  
  /**
    * The date and time this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The KMS keys used to encrypt the secret version.
    */
  var KmsKeyIds: js.UndefOr[KmsKeyIdListType] = js.undefined
  
  /**
    * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.
    */
  var LastAccessedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique version identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.undefined
  
  /**
    * An array of staging labels that are currently associated with this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.undefined
}
object SecretVersionsListEntry {
  
  inline def apply(): SecretVersionsListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersionsListEntry]
  }
  
  extension [Self <: SecretVersionsListEntry](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setKmsKeyIds(value: KmsKeyIdListType): Self = StObject.set(x, "KmsKeyIds", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdsUndefined: Self = StObject.set(x, "KmsKeyIds", js.undefined)
    
    inline def setKmsKeyIdsVarargs(value: KmsKeyIdType*): Self = StObject.set(x, "KmsKeyIds", js.Array(value*))
    
    inline def setLastAccessedDate(value: js.Date): Self = StObject.set(x, "LastAccessedDate", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedDateUndefined: Self = StObject.set(x, "LastAccessedDate", js.undefined)
    
    inline def setVersionId(value: SecretVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setVersionStages(value: SecretVersionStagesType): Self = StObject.set(x, "VersionStages", value.asInstanceOf[js.Any])
    
    inline def setVersionStagesUndefined: Self = StObject.set(x, "VersionStages", js.undefined)
    
    inline def setVersionStagesVarargs(value: SecretVersionStageType*): Self = StObject.set(x, "VersionStages", js.Array(value*))
  }
}
