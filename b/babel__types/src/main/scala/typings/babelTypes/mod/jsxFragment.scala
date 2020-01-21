package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "jsxFragment")
@js.native
object jsxFragment extends js.Object {
  def apply(
    openingFragment: JSXOpeningFragment_,
    closingFragment: JSXClosingFragment_,
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_
    ]
  ): JSXFragment_ = js.native
}

