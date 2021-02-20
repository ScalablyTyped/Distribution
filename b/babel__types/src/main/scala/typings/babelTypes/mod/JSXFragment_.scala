package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait JSXFragment_
  extends Expression
     with BaseNode
     with Immutable
     with JSX {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
  ] = js.native
  
  var closingFragment: JSXClosingFragment_ = js.native
  
  var openingFragment: JSXOpeningFragment_ = js.native
  
  @JSName("type")
  var type_JSXFragment_ : JSXFragment = js.native
}
object JSXFragment_ {
  
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXFragment_]
  }
  
  @scala.inline
  implicit class JSXFragment_MutableBuilder[Self <: JSXFragment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_)*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingFragment(value: JSXClosingFragment_): Self = StObject.set(x, "closingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningFragment(value: JSXOpeningFragment_): Self = StObject.set(x, "openingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
