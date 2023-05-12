package typings.csstoolsCssParserAlgorithms

import typings.csstoolsCssTokenizer.mod.ParseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesContextMod {
  
  trait Context extends StObject {
    
    def onParseError(error: ParseError): Unit
  }
  object Context {
    
    inline def apply(onParseError: ParseError => Unit): Context = {
      val __obj = js.Dynamic.literal(onParseError = js.Any.fromFunction1(onParseError))
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setOnParseError(value: ParseError => Unit): Self = StObject.set(x, "onParseError", js.Any.fromFunction1(value))
    }
  }
}
