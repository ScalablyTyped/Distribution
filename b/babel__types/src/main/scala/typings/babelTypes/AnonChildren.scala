package typings.babelTypes

import typings.babelTypes.mod.JSXElement_
import typings.babelTypes.mod.JSXEmptyExpression_
import typings.babelTypes.mod.JSXExpressionContainer_
import typings.babelTypes.mod.JSXFragment_
import typings.babelTypes.mod.JSXSpreadChild_
import typings.babelTypes.mod.JSXText_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
  ]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
    ]
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChildren]
  }
}

