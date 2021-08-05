package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadEntityDefinitionsRequest extends StObject {
  
  /**
    * A Boolean that specifies whether to deprecate all entities in the latest version before uploading the new DefinitionDocument. If set to true, the upload will create a new namespace version.
    */
  var deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.undefined
  
  /**
    * The DefinitionDocument that defines the updated entities.
    */
  var document: js.UndefOr[DefinitionDocument] = js.undefined
  
  /**
    * A Boolean that specifies whether to synchronize with the latest version of the public namespace. If set to true, the upload will create a new namespace version.
    */
  var syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.undefined
}
object UploadEntityDefinitionsRequest {
  
  inline def apply(): UploadEntityDefinitionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadEntityDefinitionsRequest]
  }
  
  extension [Self <: UploadEntityDefinitionsRequest](x: Self) {
    
    inline def setDeprecateExistingEntities(value: DeprecateExistingEntities): Self = StObject.set(x, "deprecateExistingEntities", value.asInstanceOf[js.Any])
    
    inline def setDeprecateExistingEntitiesUndefined: Self = StObject.set(x, "deprecateExistingEntities", js.undefined)
    
    inline def setDocument(value: DefinitionDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setSyncWithPublicNamespace(value: SyncWithPublicNamespace): Self = StObject.set(x, "syncWithPublicNamespace", value.asInstanceOf[js.Any])
    
    inline def setSyncWithPublicNamespaceUndefined: Self = StObject.set(x, "syncWithPublicNamespace", js.undefined)
  }
}
