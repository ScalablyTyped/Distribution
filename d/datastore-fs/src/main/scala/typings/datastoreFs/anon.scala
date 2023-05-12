package typings.datastoreFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dir extends StObject {
    
    var dir: String
    
    var file: String
  }
  object Dir {
    
    inline def apply(dir: String, file: String): Dir = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dir]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dir] (val x: Self) extends AnyVal {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
}
