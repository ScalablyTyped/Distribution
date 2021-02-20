package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXExpressionContainer_
  extends Node
     with Immutable
     with JSX {
  
  var expression: Expression = js.native
  
  @JSName("type")
  var type_JSXExpressionContainer_ : JSXExpressionContainer = js.native
}
object JSXExpressionContainer_ {
  
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: JSXExpressionContainer
  ): JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXExpressionContainer_]
  }
  
  @scala.inline
  implicit class JSXExpressionContainer_MutableBuilder[Self <: JSXExpressionContainer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXExpressionContainer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
