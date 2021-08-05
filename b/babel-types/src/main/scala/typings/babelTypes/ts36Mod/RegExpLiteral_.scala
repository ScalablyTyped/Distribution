package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.RegExpLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral_
  extends StObject
     with Node
     with Expression
     with Literal {
  
  var flags: js.UndefOr[String] = js.undefined
  
  var pattern: String
  
  @JSName("type")
  var type_RegExpLiteral_ : RegExpLiteral
}
object RegExpLiteral_ {
  
  inline def apply(end: Double, loc: SourceLocation, pattern: String, start: Double): RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[RegExpLiteral_]
  }
  
  extension [Self <: RegExpLiteral_](x: Self) {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
