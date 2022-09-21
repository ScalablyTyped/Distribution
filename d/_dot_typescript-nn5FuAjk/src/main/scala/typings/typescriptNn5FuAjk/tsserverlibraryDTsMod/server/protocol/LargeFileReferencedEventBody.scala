package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeFileReferencedEventBody extends StObject {
  
  /**
    * name of the large file being loaded
    */
  var file: String
  
  /**
    * size of the file
    */
  var fileSize: Double
  
  /**
    * max file size allowed on the server
    */
  var maxFileSize: Double
}
object LargeFileReferencedEventBody {
  
  inline def apply(file: String, fileSize: Double, maxFileSize: Double): LargeFileReferencedEventBody = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], maxFileSize = maxFileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeFileReferencedEventBody]
  }
  
  extension [Self <: LargeFileReferencedEventBody](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
  }
}
