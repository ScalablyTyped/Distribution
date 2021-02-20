package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadEntityDefinitionsRequest extends StObject {
  
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
  implicit class UploadEntityDefinitionsRequestMutableBuilder[Self <: UploadEntityDefinitionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeprecateExistingEntities(value: DeprecateExistingEntities): Self = StObject.set(x, "deprecateExistingEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecateExistingEntitiesUndefined: Self = StObject.set(x, "deprecateExistingEntities", js.undefined)
    
    @scala.inline
    def setDocument(value: DefinitionDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setSyncWithPublicNamespace(value: SyncWithPublicNamespace): Self = StObject.set(x, "syncWithPublicNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncWithPublicNamespaceUndefined: Self = StObject.set(x, "syncWithPublicNamespace", js.undefined)
  }
}
