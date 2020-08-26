package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadEntityDefinitionsRequest extends js.Object {
  /**
    * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new DefinitionDocument. If set to true, the upload will create a new namespace version.
    */
  var deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.native
  /**
    * The DefinitionDocument that defines the updated entities.
    */
  var document: js.UndefOr[DefinitionDocument] = js.native
  /**
    * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to true, the upload will create a new namespace version.
    */
  var syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.native
}

object UploadEntityDefinitionsRequest {
  @scala.inline
  def apply(): UploadEntityDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadEntityDefinitionsRequest]
  }
  @scala.inline
  implicit class UploadEntityDefinitionsRequestOps[Self <: UploadEntityDefinitionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeprecateExistingEntities(value: DeprecateExistingEntities): Self = this.set("deprecateExistingEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecateExistingEntities: Self = this.set("deprecateExistingEntities", js.undefined)
    @scala.inline
    def setDocument(value: DefinitionDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setSyncWithPublicNamespace(value: SyncWithPublicNamespace): Self = this.set("syncWithPublicNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncWithPublicNamespace: Self = this.set("syncWithPublicNamespace", js.undefined)
  }
  
}

