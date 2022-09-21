package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileWithProjectReferenceRedirectInfo extends StObject {
  
  /**
    * Name of file
    */
  var fileName: String
  
  /**
    * True if the file is primarily included in a referenced project
    */
  var isSourceOfProjectReferenceRedirect: Boolean
}
object FileWithProjectReferenceRedirectInfo {
  
  inline def apply(fileName: String, isSourceOfProjectReferenceRedirect: Boolean): FileWithProjectReferenceRedirectInfo = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isSourceOfProjectReferenceRedirect = isSourceOfProjectReferenceRedirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileWithProjectReferenceRedirectInfo]
  }
  
  extension [Self <: FileWithProjectReferenceRedirectInfo](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setIsSourceOfProjectReferenceRedirect(value: Boolean): Self = StObject.set(x, "isSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
  }
}
