package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXSpreadAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXSpreadAttribute_
  extends Node
     with JSX {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadAttribute_ : JSXSpreadAttribute = js.native
}
object JSXSpreadAttribute_ {
  
  @scala.inline
  def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: JSXSpreadAttribute): JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
