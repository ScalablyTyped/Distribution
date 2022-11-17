package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXElement__
  extends StObject
     with BaseNode {
  
  var children: js.Array[
    JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__
  ]
  
  var closingElement: js.UndefOr[JSXClosingElement__ | Null] = js.undefined
  
  var openingElement: JSXOpeningElement__
  
  var selfClosing: js.UndefOr[Boolean | Null] = js.undefined
  
  @JSName("type")
  var type_JSXElement__ : "JSXElement"
}
object JSXElement__ {
  
  inline def apply(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__
    ],
    openingElement: JSXOpeningElement__
  ): JSXElement__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[JSXElement__]
  }
  
  extension [Self <: JSXElement__](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosingElement(value: JSXClosingElement__): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    inline def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    inline def setClosingElementUndefined: Self = StObject.set(x, "closingElement", js.undefined)
    
    inline def setOpeningElement(value: JSXOpeningElement__): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setSelfClosingNull: Self = StObject.set(x, "selfClosing", null)
    
    inline def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    
    inline def setType(value: "JSXElement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
