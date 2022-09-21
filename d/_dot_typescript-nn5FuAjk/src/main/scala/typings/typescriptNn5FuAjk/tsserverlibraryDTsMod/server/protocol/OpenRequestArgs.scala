package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Information found in an "open" request.
  */
trait OpenRequestArgs
  extends StObject
     with FileRequestArgs {
  
  /**
    * Used when a version of the file content is known to be more up to date than the one on disk.
    * Then the known content will be used upon opening instead of the disk copy
    */
  var fileContent: js.UndefOr[String] = js.undefined
  
  /**
    * Used to limit the searching for project config file. If given the searching will stop at this
    * root path; otherwise it will go all the way up to the dist root path.
    */
  var projectRootPath: js.UndefOr[String] = js.undefined
  
  /**
    * Used to specify the script kind of the file explicitly. It could be one of the following:
    *      "TS", "JS", "TSX", "JSX"
    */
  var scriptKindName: js.UndefOr[ScriptKindName] = js.undefined
}
object OpenRequestArgs {
  
  inline def apply(file: String): OpenRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenRequestArgs]
  }
  
  extension [Self <: OpenRequestArgs](x: Self) {
    
    inline def setFileContent(value: String): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    inline def setFileContentUndefined: Self = StObject.set(x, "fileContent", js.undefined)
    
    inline def setProjectRootPath(value: String): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPathUndefined: Self = StObject.set(x, "projectRootPath", js.undefined)
    
    inline def setScriptKindName(value: ScriptKindName): Self = StObject.set(x, "scriptKindName", value.asInstanceOf[js.Any])
    
    inline def setScriptKindNameUndefined: Self = StObject.set(x, "scriptKindName", js.undefined)
  }
}
