package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXElement_
  extends Node
     with Expression
     with Immutable
     with JSX {
  
  var children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_] = js.native
  
  var closingElement: JSXClosingElement_ = js.native
  
  var openingElement: JSXOpeningElement_ = js.native
  
  var selfClosing: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_JSXElement_ : JSXElement = js.native
}
object JSXElement_ {
  
  @scala.inline
  def apply(
    children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement_]
  }
  
  @scala.inline
  implicit class JSXElement_MutableBuilder[Self <: JSXElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (JSXElement_ | JSXExpressionContainer_ | JSXText_)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingElement(value: JSXClosingElement_): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningElement(value: JSXOpeningElement_): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    
    @scala.inline
    def setType(value: JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
