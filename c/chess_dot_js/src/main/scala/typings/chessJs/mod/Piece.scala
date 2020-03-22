package typings.chessJs.mod

import typings.chessJs.chessJsStrings.b
import typings.chessJs.chessJsStrings.w
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Piece extends js.Object {
  /**
    * The color of the piece
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w
  /**
    * The type of the piece to place
    */
  var `type`: PieceType
}

object Piece {
  @scala.inline
  def apply(color: b | w, `type`: PieceType): Piece = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Piece]
  }
}

