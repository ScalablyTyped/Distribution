package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.NumericLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral_
  extends StObject
     with Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_NumericLiteral_ : NumericLiteral
  
  var value: Double
}
object NumericLiteral_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: Double): NumericLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[NumericLiteral_]
  }
  
  extension [Self <: NumericLiteral_](x: Self) {
    
    inline def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
