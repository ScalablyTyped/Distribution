package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NullLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteral_
  extends StObject
     with Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_NullLiteral_ : NullLiteral
}
object NullLiteral_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double): NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[NullLiteral_]
  }
  
  extension [Self <: NullLiteral_](x: Self) {
    
    inline def setType(value: NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
