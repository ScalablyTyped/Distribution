package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.libMod.ReturnedChild because Already inherited */ trait JSXElement
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with JSX
     with Node {
  
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  
  var closingElement: js.UndefOr[JSXClosingElement | Null] = js.undefined
  
  var openingElement: JSXOpeningElement
  
  var selfClosing: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("type")
  var type_JSXElement: typings.babelTypes.babelTypesStrings.JSXElement
}
object JSXElement {
  
  inline def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    openingElement: JSXOpeningElement
  ): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[JSXElement]
  }
  
  extension [Self <: JSXElement](x: Self) {
    
    inline def setChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosingElement(value: JSXClosingElement): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    inline def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    inline def setClosingElementUndefined: Self = StObject.set(x, "closingElement", js.undefined)
    
    inline def setOpeningElement(value: JSXOpeningElement): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setSelfClosingNull: Self = StObject.set(x, "selfClosing", null)
    
    inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
