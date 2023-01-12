package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BooleanLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanLiteral_
  extends StObject
     with Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  
  @JSName("type")
  var type_BooleanLiteral_ : BooleanLiteral
  
  var value: Boolean
}
object BooleanLiteral_ {
  
  inline def apply(end: Double, loc: SourceLocation, start: Double, value: Boolean): BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[BooleanLiteral_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanLiteral_] (val x: Self) extends AnyVal {
    
    inline def setType(value: BooleanLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
