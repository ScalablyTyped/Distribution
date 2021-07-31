package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretVersionsListEntry extends StObject {
  
  /**
    * The date and time this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[CreatedDateType] = js.undefined
  
  /**
    * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.
    */
  var LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.undefined
  
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
  
  @scala.inline
  def apply(): SecretVersionsListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersionsListEntry]
  }
  
  @scala.inline
  implicit class SecretVersionsListEntryMutableBuilder[Self <: SecretVersionsListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: CreatedDateType): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setLastAccessedDate(value: LastAccessedDateType): Self = StObject.set(x, "LastAccessedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedDateUndefined: Self = StObject.set(x, "LastAccessedDate", js.undefined)
    
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
