package typings.contentfulManagement.anon

import typings.node.streamMod.Stream
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait File extends StObject {
  
  var contentType: String
  
  var file: String | ArrayBuffer | Stream
  
  var fileName: String
}
object File {
  
  inline def apply(contentType: String, file: String | ArrayBuffer | Stream, fileName: String): File = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  
  extension [Self <: File](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setFile(value: String | ArrayBuffer | Stream): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
