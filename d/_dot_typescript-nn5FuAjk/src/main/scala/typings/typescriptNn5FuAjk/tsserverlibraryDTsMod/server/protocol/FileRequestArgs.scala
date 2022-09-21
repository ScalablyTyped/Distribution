package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Arguments for FileRequest messages.
  */
trait FileRequestArgs extends StObject {
  
  /**
    * The file for the request (absolute pathname required).
    */
  var file: String
  
  var projectFileName: js.UndefOr[String] = js.undefined
}
object FileRequestArgs {
  
  inline def apply(file: String): FileRequestArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRequestArgs]
  }
  
  extension [Self <: FileRequestArgs](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setProjectFileName(value: String): Self = StObject.set(x, "projectFileName", value.asInstanceOf[js.Any])
    
    inline def setProjectFileNameUndefined: Self = StObject.set(x, "projectFileName", js.undefined)
  }
}
