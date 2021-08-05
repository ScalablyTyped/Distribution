package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpConstructor extends StObject {
  
  def escape(str: java.lang.String): java.lang.String
}
object RegExpConstructor {
  
  inline def apply(escape: java.lang.String => java.lang.String): RegExpConstructor = {
    val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
    __obj.asInstanceOf[RegExpConstructor]
  }
  
  extension [Self <: RegExpConstructor](x: Self) {
    
    inline def setEscape(value: java.lang.String => java.lang.String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
  }
}
