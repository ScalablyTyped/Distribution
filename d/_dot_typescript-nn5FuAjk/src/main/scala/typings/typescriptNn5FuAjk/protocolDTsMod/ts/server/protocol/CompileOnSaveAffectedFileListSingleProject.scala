package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a list of files that should be regenerated in a project
  */
trait CompileOnSaveAffectedFileListSingleProject extends StObject {
  
  /**
    * List of files names that should be recompiled
    */
  var fileNames: Array[String]
  
  /**
    * Project name
    */
  var projectFileName: String
  
  /**
    * true if project uses outFile or out compiler option
    */
  var projectUsesOutFile: Boolean
}
object CompileOnSaveAffectedFileListSingleProject {
  
  inline def apply(fileNames: Array[String], projectFileName: String, projectUsesOutFile: Boolean): CompileOnSaveAffectedFileListSingleProject = {
    val __obj = js.Dynamic.literal(fileNames = fileNames.asInstanceOf[js.Any], projectFileName = projectFileName.asInstanceOf[js.Any], projectUsesOutFile = projectUsesOutFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileOnSaveAffectedFileListSingleProject]
  }
  
  extension [Self <: CompileOnSaveAffectedFileListSingleProject](x: Self) {
    
    inline def setFileNames(value: Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setProjectFileName(value: String): Self = StObject.set(x, "projectFileName", value.asInstanceOf[js.Any])
    
    inline def setProjectUsesOutFile(value: Boolean): Self = StObject.set(x, "projectUsesOutFile", value.asInstanceOf[js.Any])
  }
}
