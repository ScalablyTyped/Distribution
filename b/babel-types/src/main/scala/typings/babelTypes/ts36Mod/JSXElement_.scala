package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.JSXElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXElement_
  extends StObject
     with Node
     with Expression
     with Immutable
     with JSX {
  
  var children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]
  
  var closingElement: JSXClosingElement_
  
  var openingElement: JSXOpeningElement_
  
  var selfClosing: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_JSXElement_ : JSXElement
}
object JSXElement_ {
  
  inline def apply(
    children: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[JSXElement_]
  }
  
  extension [Self <: JSXElement_](x: Self) {
    
    inline def setChildren(value: js.Array[JSXElement_ | JSXExpressionContainer_ | JSXText_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXElement_ | JSXExpressionContainer_ | JSXText_)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setClosingElement(value: JSXClosingElement_): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    inline def setOpeningElement(value: JSXOpeningElement_): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    
    inline def setType(value: JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
