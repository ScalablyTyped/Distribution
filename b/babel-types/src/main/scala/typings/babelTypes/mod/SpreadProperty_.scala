package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SpreadProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadProperty_
  extends StObject
     with Node
     with UnaryLike {
  
  var argument: Expression
  
  @JSName("type")
  var type_SpreadProperty_ : SpreadProperty
}
object SpreadProperty_ {
  
  inline def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double): SpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadProperty")
    __obj.asInstanceOf[SpreadProperty_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpreadProperty_] (val x: Self) extends AnyVal {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: SpreadProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
