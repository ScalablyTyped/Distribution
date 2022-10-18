package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileReferenceObject
  extends StObject
     with _FileReference {
  
  /*
    * Buffers will be used as-is, while strings will be interpreted as an alias or a file path.
    * All other types will have `Buffer.from(JSON.stringify())` applied.
    */
  var contents: Any
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var lastModified: js.UndefOr[Double] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
}
object FileReferenceObject {
  
  inline def apply(contents: Any): FileReferenceObject = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileReferenceObject]
  }
  
  extension [Self <: FileReferenceObject](x: Self) {
    
    inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
