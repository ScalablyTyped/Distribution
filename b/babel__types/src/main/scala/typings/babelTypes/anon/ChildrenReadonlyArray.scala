package typings.babelTypes.anon

import typings.babelTypes.mod.JSXElement_
import typings.babelTypes.mod.JSXEmptyExpression_
import typings.babelTypes.mod.JSXExpressionContainer_
import typings.babelTypes.mod.JSXFragment_
import typings.babelTypes.mod.JSXSpreadChild_
import typings.babelTypes.mod.JSXText_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildrenReadonlyArray extends StObject {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
  ] = js.native
}
object ChildrenReadonlyArray {
  
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
    ]
  ): ChildrenReadonlyArray = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenReadonlyArray]
  }
  
  @scala.inline
  implicit class ChildrenReadonlyArrayMutableBuilder[Self <: ChildrenReadonlyArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(
      value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
