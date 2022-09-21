package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represent an external project
  */
trait ExternalProject extends StObject {
  
  /**
    * Compiler options for the project
    */
  var options: ExternalProjectCompilerOptions
  
  /**
    * Project name
    */
  var projectFileName: String
  
  /**
    * List of root files in project
    */
  var rootFiles: Array[ExternalFile]
  
  /**
    * Explicitly specified type acquisition for the project
    */
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  
  /**
    * @deprecated typingOptions. Use typeAcquisition instead
    */
  var typingOptions: js.UndefOr[TypeAcquisition] = js.undefined
}
object ExternalProject {
  
  inline def apply(options: ExternalProjectCompilerOptions, projectFileName: String, rootFiles: Array[ExternalFile]): ExternalProject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], projectFileName = projectFileName.asInstanceOf[js.Any], rootFiles = rootFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalProject]
  }
  
  extension [Self <: ExternalProject](x: Self) {
    
    inline def setOptions(value: ExternalProjectCompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProjectFileName(value: String): Self = StObject.set(x, "projectFileName", value.asInstanceOf[js.Any])
    
    inline def setRootFiles(value: Array[ExternalFile]): Self = StObject.set(x, "rootFiles", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    inline def setTypingOptions(value: TypeAcquisition): Self = StObject.set(x, "typingOptions", value.asInstanceOf[js.Any])
    
    inline def setTypingOptionsUndefined: Self = StObject.set(x, "typingOptions", js.undefined)
  }
}
