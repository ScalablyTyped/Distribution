package typings.atBabelTypes

import typings.atBabelTypes.atBabelTypesMod.JSXElement
import typings.atBabelTypes.atBabelTypesMod.JSXEmptyExpression
import typings.atBabelTypes.atBabelTypesMod.JSXExpressionContainer
import typings.atBabelTypes.atBabelTypesMod.JSXFragment
import typings.atBabelTypes.atBabelTypesMod.JSXSpreadChild
import typings.atBabelTypes.atBabelTypesMod.JSXText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.Array[
    JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment | JSXEmptyExpression
  ]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment | JSXEmptyExpression
    ]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

