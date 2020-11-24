package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.JSXFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
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
  implicit class JSXFragment_Ops[Self <: JSXFragment_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_)*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
        ]
    ): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingFragment(value: JSXClosingFragment_): Self = this.set("closingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpeningFragment(value: JSXOpeningFragment_): Self = this.set("openingFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: JSXFragment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
