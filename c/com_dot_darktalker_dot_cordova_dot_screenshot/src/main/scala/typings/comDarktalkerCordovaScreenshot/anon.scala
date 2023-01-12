package typings.comDarktalkerCordovaScreenshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilePath extends StObject {
    
    var filePath: String
    
    var success: Boolean
  }
  object FilePath {
    
    inline def apply(filePath: String, success: Boolean): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait URI extends StObject {
    
    var URI: String
  }
  object URI {
    
    inline def apply(URI: String): URI = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
      __obj.asInstanceOf[URI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URI] (val x: Self) extends AnyVal {
      
      inline def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
