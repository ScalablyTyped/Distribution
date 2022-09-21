package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message body for "projectInfo" request
  */
trait ProjectInfo extends StObject {
  
  /**
    * For configured project, this is the normalized path of the 'tsconfig.json' file
    * For inferred project, this is undefined
    */
  var configFileName: String
  
  /**
    * The list of normalized file name in the project, including 'lib.d.ts'
    */
  var fileNames: js.UndefOr[Array[String]] = js.undefined
  
  /**
    * Indicates if the project has a active language service instance
    */
  var languageServiceDisabled: js.UndefOr[Boolean] = js.undefined
}
object ProjectInfo {
  
  inline def apply(configFileName: String): ProjectInfo = {
    val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfo]
  }
  
  extension [Self <: ProjectInfo](x: Self) {
    
    inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setFileNames(value: Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    inline def setFileNamesUndefined: Self = StObject.set(x, "fileNames", js.undefined)
    
    inline def setLanguageServiceDisabled(value: Boolean): Self = StObject.set(x, "languageServiceDisabled", value.asInstanceOf[js.Any])
    
    inline def setLanguageServiceDisabledUndefined: Self = StObject.set(x, "languageServiceDisabled", js.undefined)
  }
}
