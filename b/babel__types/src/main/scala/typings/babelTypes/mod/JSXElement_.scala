package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXElement_
  extends StObject
     with BaseNode {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
  ]
  
  var closingElement: JSXClosingElement_ | Null
  
  var openingElement: JSXOpeningElement_
  
  var selfClosing: Boolean | Null
  
  @JSName("type")
  var type_JSXElement_ : "JSXElement"
}
object JSXElement_ {
  
  inline def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[JSXElement_]
  }
  
  extension [Self <: JSXElement_](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosingElement(value: JSXClosingElement_): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    inline def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    inline def setOpeningElement(value: JSXOpeningElement_): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setSelfClosingNull: Self = StObject.set(x, "selfClosing", null)
    
    inline def setType(value: "JSXElement"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
