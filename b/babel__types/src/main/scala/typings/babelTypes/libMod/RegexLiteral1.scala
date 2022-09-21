package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.RegexLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use `RegExpLiteral`
  */
trait RegexLiteral1
  extends StObject
     with BaseNode
     with DeprecatedAliases
     with Node {
  
  var flags: String
  
  var pattern: String
  
  @JSName("type")
  var type_RegexLiteral1: RegexLiteral
}
object RegexLiteral1 {
  
  inline def apply(flags: String, pattern: String): RegexLiteral1 = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexLiteral")
    __obj.asInstanceOf[RegexLiteral1]
  }
  
  extension [Self <: RegexLiteral1](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: RegexLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
