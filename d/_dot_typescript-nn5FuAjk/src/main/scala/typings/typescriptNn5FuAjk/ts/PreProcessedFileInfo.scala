package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreProcessedFileInfo extends StObject {
  
  var ambientExternalModules: js.UndefOr[Array[java.lang.String]] = js.undefined
  
  var importedFiles: Array[FileReference]
  
  var isLibFile: Boolean
  
  var libReferenceDirectives: Array[FileReference]
  
  var referencedFiles: Array[FileReference]
  
  var typeReferenceDirectives: Array[FileReference]
}
object PreProcessedFileInfo {
  
  inline def apply(
    importedFiles: Array[FileReference],
    isLibFile: Boolean,
    libReferenceDirectives: Array[FileReference],
    referencedFiles: Array[FileReference],
    typeReferenceDirectives: Array[FileReference]
  ): PreProcessedFileInfo = {
    val __obj = js.Dynamic.literal(importedFiles = importedFiles.asInstanceOf[js.Any], isLibFile = isLibFile.asInstanceOf[js.Any], libReferenceDirectives = libReferenceDirectives.asInstanceOf[js.Any], referencedFiles = referencedFiles.asInstanceOf[js.Any], typeReferenceDirectives = typeReferenceDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessedFileInfo]
  }
  
  extension [Self <: PreProcessedFileInfo](x: Self) {
    
    inline def setAmbientExternalModules(value: Array[java.lang.String]): Self = StObject.set(x, "ambientExternalModules", value.asInstanceOf[js.Any])
    
    inline def setAmbientExternalModulesUndefined: Self = StObject.set(x, "ambientExternalModules", js.undefined)
    
    inline def setImportedFiles(value: Array[FileReference]): Self = StObject.set(x, "importedFiles", value.asInstanceOf[js.Any])
    
    inline def setIsLibFile(value: Boolean): Self = StObject.set(x, "isLibFile", value.asInstanceOf[js.Any])
    
    inline def setLibReferenceDirectives(value: Array[FileReference]): Self = StObject.set(x, "libReferenceDirectives", value.asInstanceOf[js.Any])
    
    inline def setReferencedFiles(value: Array[FileReference]): Self = StObject.set(x, "referencedFiles", value.asInstanceOf[js.Any])
    
    inline def setTypeReferenceDirectives(value: Array[FileReference]): Self = StObject.set(x, "typeReferenceDirectives", value.asInstanceOf[js.Any])
  }
}
