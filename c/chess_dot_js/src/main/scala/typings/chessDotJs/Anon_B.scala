package typings.chessDotJs

import typings.chessDotJs.chessDotJsStrings.b
import typings.chessDotJs.chessDotJsStrings.c
import typings.chessDotJs.chessDotJsStrings.e
import typings.chessDotJs.chessDotJsStrings.k
import typings.chessDotJs.chessDotJsStrings.n
import typings.chessDotJs.chessDotJsStrings.p
import typings.chessDotJs.chessDotJsStrings.q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
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

object Anon_B {
  @scala.inline
  def apply(BIG_PAWN: b, CAPTURE: c, EP_CAPTURE: e, KSIDE_CASTLE: k, NORMAL: n, PROMOTION: p, QSIDE_CASTLE: q): Anon_B = {
    val __obj = js.Dynamic.literal(BIG_PAWN = BIG_PAWN, CAPTURE = CAPTURE, EP_CAPTURE = EP_CAPTURE, KSIDE_CASTLE = KSIDE_CASTLE, NORMAL = NORMAL, PROMOTION = PROMOTION, QSIDE_CASTLE = QSIDE_CASTLE)
  
    __obj.asInstanceOf[Anon_B]
  }
}

