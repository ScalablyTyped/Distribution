package typings.colord.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parsers extends StObject {
  
  var `object`: js.Array[Parser[InputObject]]
  
  var string: js.Array[Parser[String]]
}
object Parsers {
  
  inline def apply(`object`: js.Array[Parser[InputObject]], string: js.Array[Parser[String]]): Parsers = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parsers] (val x: Self) extends AnyVal {
    
    inline def setObject(value: js.Array[Parser[InputObject]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectVarargs(value: Parser[InputObject]*): Self = StObject.set(x, "object", js.Array(value*))
    
    inline def setString(value: js.Array[Parser[String]]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringVarargs(value: Parser[String]*): Self = StObject.set(x, "string", js.Array(value*))
  }
}
