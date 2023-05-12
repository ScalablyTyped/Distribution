package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait ILineAndUri extends StObject {
    
    var line: Double
    
    var uri: String
  }
  object ILineAndUri {
    
    inline def apply(line: Double, uri: String): ILineAndUri = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILineAndUri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILineAndUri] (val x: Self) extends AnyVal {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
