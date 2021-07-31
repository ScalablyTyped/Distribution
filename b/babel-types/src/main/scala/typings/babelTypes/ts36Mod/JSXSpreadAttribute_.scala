package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXSpreadAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXSpreadAttribute_
  extends StObject
     with Node
     with JSX {
  
  var argument: Expression
  
  @JSName("type")
  var type_JSXSpreadAttribute_ : JSXSpreadAttribute
}
object JSXSpreadAttribute_ {
  
  @scala.inline
  def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double): JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[JSXSpreadAttribute_]
  }
  
  @scala.inline
  implicit class JSXSpreadAttribute_MutableBuilder[Self <: JSXSpreadAttribute_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXSpreadAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
