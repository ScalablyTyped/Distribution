package typings
package chessDotJsLib.chessDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Piece extends js.Object {
  /**
    * The color of the piece
    * - "b" for Black
    * - "w" for White
    */
  var color: chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.w
  /**
    * The type of the piece to place
    * - "p" for Pawn
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    * - "k" for King
    */
  var `type`: chessDotJsLib.chessDotJsLibStrings.p | chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q | chessDotJsLib.chessDotJsLibStrings.k
}

object Piece {
  @scala.inline
  def apply(
    color: chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.w,
    `type`: chessDotJsLib.chessDotJsLibStrings.p | chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q | chessDotJsLib.chessDotJsLibStrings.k
  ): Piece = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Piece]
  }
}

