package typings.cfb

import typings.cfb.mod.CFBBlob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Header extends StObject {
    
    var header: CFBBlob
    
    var sectors: js.Array[CFBBlob]
  }
  object Header {
    
    inline def apply(header: CFBBlob, sectors: js.Array[CFBBlob]): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], sectors = sectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setHeader(value: CFBBlob): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderVarargs(value: Double*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setSectors(value: js.Array[CFBBlob]): Self = StObject.set(x, "sectors", value.asInstanceOf[js.Any])
      
      inline def setSectorsVarargs(value: CFBBlob*): Self = StObject.set(x, "sectors", js.Array(value*))
    }
  }
}
