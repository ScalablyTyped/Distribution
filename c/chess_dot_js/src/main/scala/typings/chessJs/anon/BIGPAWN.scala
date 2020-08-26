package typings.chessJs.anon

import typings.chessJs.chessJsStrings.b
import typings.chessJs.chessJsStrings.c
import typings.chessJs.chessJsStrings.e
import typings.chessJs.chessJsStrings.k
import typings.chessJs.chessJsStrings.n
import typings.chessJs.chessJsStrings.p
import typings.chessJs.chessJsStrings.q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BIGPAWN extends js.Object {
  /** a pawn push of two squares */
  var BIG_PAWN: b = js.native
  /** a standard capture */
  var CAPTURE: c = js.native
  /** an en passant capture */
  var EP_CAPTURE: e = js.native
  /** kingside castling */
  var KSIDE_CASTLE: k = js.native
  /** a non-capture */
  var NORMAL: n = js.native
  /** a promotion */
  var PROMOTION: p = js.native
  /** queenside castling */
  var QSIDE_CASTLE: q = js.native
}

object BIGPAWN {
  @scala.inline
  def apply(BIG_PAWN: b, CAPTURE: c, EP_CAPTURE: e, KSIDE_CASTLE: k, NORMAL: n, PROMOTION: p, QSIDE_CASTLE: q): BIGPAWN = {
    val __obj = js.Dynamic.literal(BIG_PAWN = BIG_PAWN.asInstanceOf[js.Any], CAPTURE = CAPTURE.asInstanceOf[js.Any], EP_CAPTURE = EP_CAPTURE.asInstanceOf[js.Any], KSIDE_CASTLE = KSIDE_CASTLE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], PROMOTION = PROMOTION.asInstanceOf[js.Any], QSIDE_CASTLE = QSIDE_CASTLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIGPAWN]
  }
  @scala.inline
  implicit class BIGPAWNOps[Self <: BIGPAWN] (val x: Self) extends AnyVal {
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
    def setBIG_PAWN(value: b): Self = this.set("BIG_PAWN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCAPTURE(value: c): Self = this.set("CAPTURE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEP_CAPTURE(value: e): Self = this.set("EP_CAPTURE", value.asInstanceOf[js.Any])
    @scala.inline
    def setKSIDE_CASTLE(value: k): Self = this.set("KSIDE_CASTLE", value.asInstanceOf[js.Any])
    @scala.inline
    def setNORMAL(value: n): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPROMOTION(value: p): Self = this.set("PROMOTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSIDE_CASTLE(value: q): Self = this.set("QSIDE_CASTLE", value.asInstanceOf[js.Any])
  }
  
}

