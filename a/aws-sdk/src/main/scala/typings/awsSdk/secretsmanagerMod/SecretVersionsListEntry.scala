package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecretVersionsListEntry extends js.Object {
  
  /**
    * The date and time this version of the secret was created.
    */
  var CreatedDate: js.UndefOr[CreatedDateType] = js.native
  
  /**
    * The date that this version of the secret was last accessed. Note that the resolution of this field is at the date level and does not include the time.
    */
  var LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.native
  
  /**
    * The unique version identifier of this version of the secret.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
  
  /**
    * An array of staging labels that are currently associated with this version of the secret.
    */
  var VersionStages: js.UndefOr[SecretVersionStagesType] = js.native
}
object SecretVersionsListEntry {
  
  @scala.inline
  def apply(): SecretVersionsListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretVersionsListEntry]
  }
  
  @scala.inline
  implicit class SecretVersionsListEntryOps[Self <: SecretVersionsListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedDate(value: CreatedDateType): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setLastAccessedDate(value: LastAccessedDateType): Self = this.set("LastAccessedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastAccessedDate: Self = this.set("LastAccessedDate", js.undefined)
    
    @scala.inline
    def setVersionId(value: SecretVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
    
    @scala.inline
    def setVersionStagesVarargs(value: SecretVersionStageType*): Self = this.set("VersionStages", js.Array(value :_*))
    
    @scala.inline
    def setVersionStages(value: SecretVersionStagesType): Self = this.set("VersionStages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionStages: Self = this.set("VersionStages", js.undefined)
  }
}
