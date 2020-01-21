package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "jsxElement")
@js.native
object jsxElement extends js.Object {
  def apply(
    openingElement: JSXOpeningElement_,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    selfClosing: js.Any
  ): JSXElement_ = js.native
  def apply(
    openingElement: JSXOpeningElement_,
    closingElement: Null,
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    selfClosing: js.Any
  ): JSXElement_ = js.native
  def apply(
    openingElement: JSXOpeningElement_,
    closingElement: JSXClosingElement_,
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ],
    selfClosing: js.Any
  ): JSXElement_ = js.native
}

