package typings.chessJs.anon

import typings.chessJs.chessJsStrings.b
import typings.chessJs.chessJsStrings.w
import typings.chessJs.mod.PieceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: w | b
  var `type`: PieceType
}

object Color {
  @scala.inline
  def apply(color: w | b, `type`: PieceType): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

