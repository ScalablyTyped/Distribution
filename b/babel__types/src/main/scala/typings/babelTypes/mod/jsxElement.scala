package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "jsxElement")
@js.native
object jsxElement extends js.Object {
  def apply(
    openingElement: JSXOpeningElement_,
    closingElement: js.UndefOr[JSXClosingElement_ | Null],
    children: js.Array[
      JSXElement_ | JSXExpressionContainer_ | JSXFragment_ | JSXSpreadChild_ | JSXText_
    ],
    selfClosing: js.Any
  ): JSXElement_ = js.native
}

