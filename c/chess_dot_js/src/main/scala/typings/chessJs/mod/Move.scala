package typings.chessJs.mod

import typings.chessJs.chessJsStrings.b
import typings.chessJs.chessJsStrings.k
import typings.chessJs.chessJsStrings.w
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Move extends ShortMove {
  /**
    * If an enemy piece was captured this is their type
    */
  var captured: js.UndefOr[Exclude[PieceType, k]] = js.native
  /**
    * The color of the piece that moved
    * - "b" for Black
    * - "w" for White
    */
  var color: b | w = js.native
  /** Flags indicating what occurred, combined into one string */
  var flags: String = js.native
  /**
    * The type of the piece that moved
    */
  var piece: PieceType = js.native
  /** The Standard Algebraic Notation (SAN) representation of the move */
  var san: String = js.native
}

object Move {
  @scala.inline
  def apply(color: b | w, flags: String, from: Square, piece: PieceType, san: String, to: Square): Move = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], piece = piece.asInstanceOf[js.Any], san = san.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  @scala.inline
  implicit class MoveOps[Self <: Move] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColor(value: b | w): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setPiece(value: PieceType): Self = this.set("piece", value.asInstanceOf[js.Any])
    @scala.inline
    def setSan(value: String): Self = this.set("san", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaptured(value: Exclude[PieceType, k]): Self = this.set("captured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptured: Self = this.set("captured", js.undefined)
  }
  
}

