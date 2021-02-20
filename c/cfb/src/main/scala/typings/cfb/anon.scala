package typings.cfb

import typings.cfb.mod.CFBBlob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Header extends StObject {
    
    var header: CFBBlob = js.native
    
    var sectors: js.Array[CFBBlob] = js.native
  }
  object Header {
    
    @scala.inline
    def apply(header: CFBBlob, sectors: js.Array[CFBBlob]): Header = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], sectors = sectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: CFBBlob): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVarargs(value: Double*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setSectors(value: js.Array[CFBBlob]): Self = StObject.set(x, "sectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectorsVarargs(value: CFBBlob*): Self = StObject.set(x, "sectors", js.Array(value :_*))
    }
  }
}
