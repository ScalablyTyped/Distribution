package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral_
  extends StObject
     with BaseNode {
  
  var flags: String
  
  var pattern: String
  
  @JSName("type")
  var type_RegExpLiteral_ : "RegExpLiteral"
}
object RegExpLiteral_ {
  
  inline def apply(flags: String, pattern: String): RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[RegExpLiteral_]
  }
  
  extension [Self <: RegExpLiteral_](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: "RegExpLiteral"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
