package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait JSXElement_
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
  ] = js.native
  
  var closingElement: JSXClosingElement_ | Null = js.native
  
  var openingElement: JSXOpeningElement_ = js.native
  
  var selfClosing: Boolean | Null = js.native
  
  @JSName("type")
  var type_JSXElement_ : JSXElement = js.native
}
object JSXElement_ {
  
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXElement_]
  }
  
  @scala.inline
  implicit class JSXElement_MutableBuilder[Self <: JSXElement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingElement(value: JSXClosingElement_): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    @scala.inline
    def setOpeningElement(value: JSXOpeningElement_): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosingNull: Self = StObject.set(x, "selfClosing", null)
    
    @scala.inline
    def setType(value: JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
