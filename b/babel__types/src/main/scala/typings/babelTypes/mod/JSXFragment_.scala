package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait JSXFragment_
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with JSX {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
  ]
  
  var closingFragment: JSXClosingFragment_
  
  var openingFragment: JSXOpeningFragment_
  
  @JSName("type")
  var type_JSXFragment_ : JSXFragment
}
object JSXFragment_ {
  
  inline def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[JSXFragment_]
  }
  
  extension [Self <: JSXFragment_](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setClosingFragment(value: JSXClosingFragment_): Self = StObject.set(x, "closingFragment", value.asInstanceOf[js.Any])
    
    inline def setOpeningFragment(value: JSXOpeningFragment_): Self = StObject.set(x, "openingFragment", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
