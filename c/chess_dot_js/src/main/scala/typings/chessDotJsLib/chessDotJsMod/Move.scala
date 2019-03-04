package typings
package chessDotJsLib.chessDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Move extends ShortMove {
  /**
    * If an enemy piece was captured this is their type.
    * - "p" for Pawn
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    */
  var captured: js.UndefOr[
    chessDotJsLib.chessDotJsLibStrings.p | chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q
  ] = js.undefined
  /**
    * The color of the piece that moved
    * - "b" for Black
    * - "w" for White
    */
  var color: chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.w
  /** Flags indicating what occurred, combined into one string */
  var flags: java.lang.String
  /**
    * The type of the piece that moved
    * - "p" for Pawn
    * - "n" for Knight
    * - "b" for Bishop
    * - "r" for Rook
    * - "q" for Queen
    * - "k" for King
    */
  var piece: chessDotJsLib.chessDotJsLibStrings.p | chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q | chessDotJsLib.chessDotJsLibStrings.k
  /** The Standard Algebraic Notation (SAN) representation of the move */
  var san: java.lang.String
}

object Move {
  @scala.inline
  def apply(
    color: chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.w,
    flags: java.lang.String,
    from: Square,
    piece: chessDotJsLib.chessDotJsLibStrings.p | chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q | chessDotJsLib.chessDotJsLibStrings.k,
    san: java.lang.String,
    to: Square,
    captured: chessDotJsLib.chessDotJsLibStrings.p | chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q = null,
    promotion: chessDotJsLib.chessDotJsLibStrings.n | chessDotJsLib.chessDotJsLibStrings.b | chessDotJsLib.chessDotJsLibStrings.r | chessDotJsLib.chessDotJsLibStrings.q = null
  ): Move = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags, from = from, piece = piece.asInstanceOf[js.Any], san = san, to = to)
    if (captured != null) __obj.updateDynamic("captured")(captured.asInstanceOf[js.Any])
    if (promotion != null) __obj.updateDynamic("promotion")(promotion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
}

