package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.SpreadElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpreadElement_
  extends StObject
     with Node
     with UnaryLike {
  
  var argument: Expression
  
  @JSName("type")
  var type_SpreadElement_ : SpreadElement
}
object SpreadElement_ {
  
  inline def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double): SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[SpreadElement_]
  }
  
  extension [Self <: SpreadElement_](x: Self) {
    
    inline def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setType(value: SpreadElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
