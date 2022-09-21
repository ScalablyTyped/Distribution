package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.libMod.ReturnedChild because Already inherited */ trait JSXFragment
  extends StObject
     with BaseNode
     with Expression
     with Immutable
     with JSX
     with Node {
  
  var children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  
  var closingFragment: JSXClosingFragment
  
  var openingFragment: JSXOpeningFragment
  
  @JSName("type")
  var type_JSXFragment: typings.babelTypes.babelTypesStrings.JSXFragment
}
object JSXFragment {
  
  inline def apply(
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[JSXFragment]
  }
  
  extension [Self <: JSXFragment](x: Self) {
    
    inline def setChildren(value: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosingFragment(value: JSXClosingFragment): Self = StObject.set(x, "closingFragment", value.asInstanceOf[js.Any])
    
    inline def setOpeningFragment(value: JSXOpeningFragment): Self = StObject.set(x, "openingFragment", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
