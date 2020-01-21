package typings.chessJs

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

trait AnonB extends js.Object {
  /** a pawn push of two squares */
  var BIG_PAWN: b
  /** a standard capture */
  var CAPTURE: c
  /** an en passant capture */
  var EP_CAPTURE: e
  /** kingside castling */
  var KSIDE_CASTLE: k
  /** a non-capture */
  var NORMAL: n
  /** a promotion */
  var PROMOTION: p
  /** queenside castling */
  var QSIDE_CASTLE: q
}

object AnonB {
  @scala.inline
  def apply(BIG_PAWN: b, CAPTURE: c, EP_CAPTURE: e, KSIDE_CASTLE: k, NORMAL: n, PROMOTION: p, QSIDE_CASTLE: q): AnonB = {
    val __obj = js.Dynamic.literal(BIG_PAWN = BIG_PAWN.asInstanceOf[js.Any], CAPTURE = CAPTURE.asInstanceOf[js.Any], EP_CAPTURE = EP_CAPTURE.asInstanceOf[js.Any], KSIDE_CASTLE = KSIDE_CASTLE.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], PROMOTION = PROMOTION.asInstanceOf[js.Any], QSIDE_CASTLE = QSIDE_CASTLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonB]
  }
}

