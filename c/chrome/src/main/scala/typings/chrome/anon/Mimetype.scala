package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mimetype extends StObject {
  
  var mime_type: String
  
  var path: String
}
object Mimetype {
  
  inline def apply(mime_type: String, path: String): Mimetype = {
    val __obj = js.Dynamic.literal(mime_type = mime_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mimetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mimetype] (val x: Self) extends AnyVal {
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
