package typings.comDarktalkerCordovaScreenshot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FilePath extends StObject {
    
    var filePath: String = js.native
    
    var success: Boolean = js.native
  }
  object FilePath {
    
    @scala.inline
    def apply(filePath: String, success: Boolean): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    @scala.inline
    implicit class FilePathMutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait URI extends StObject {
    
    var URI: String = js.native
  }
  object URI {
    
    @scala.inline
    def apply(URI: String): URI = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
      __obj.asInstanceOf[URI]
    }
    
    @scala.inline
    implicit class URIMutableBuilder[Self <: URI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setURI(value: String): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
