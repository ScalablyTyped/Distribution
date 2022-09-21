package typings.gitlabNBHG3ede.anon

import typings.gitlabNBHG3ede.projectImportExportDTsMod.UploadMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  metadata :.gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/services/ProjectImportExport.d.ts.UploadMetadata | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.Sudo */
trait metadataUploadMetadataund extends StObject {
  
  var metadata: js.UndefOr[UploadMetadata] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object metadataUploadMetadataund {
  
  inline def apply(): metadataUploadMetadataund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[metadataUploadMetadataund]
  }
  
  extension [Self <: metadataUploadMetadataund](x: Self) {
    
    inline def setMetadata(value: UploadMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
