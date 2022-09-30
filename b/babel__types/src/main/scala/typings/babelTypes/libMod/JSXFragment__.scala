package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.JSXFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.libMod.ReturnedChild because Already inherited */ trait JSXFragment__
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with JSX
     with Node {
  
  var children: js.Array[
    JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__
  ]
  
  var closingFragment: JSXClosingFragment__
  
  var openingFragment: JSXOpeningFragment__
  
  @JSName("type")
  var type_JSXFragment__ : JSXFragment
}
object JSXFragment__ {
  
  inline def apply(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__
    ],
    closingFragment: JSXClosingFragment__,
    openingFragment: JSXOpeningFragment__
  ): JSXFragment__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[JSXFragment__]
  }
  
  extension [Self <: JSXFragment__](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | JSXFragment__)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosingFragment(value: JSXClosingFragment__): Self = StObject.set(x, "closingFragment", value.asInstanceOf[js.Any])
    
    inline def setOpeningFragment(value: JSXOpeningFragment__): Self = StObject.set(x, "openingFragment", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
