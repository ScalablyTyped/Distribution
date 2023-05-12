package typings.blobshape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Path extends StObject {
    
    var path: String
    
    var seedValue: Double
  }
  object Path {
    
    inline def apply(path: String, seedValue: Double): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], seedValue = seedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSeedValue(value: Double): Self = StObject.set(x, "seedValue", value.asInstanceOf[js.Any])
    }
  }
}
