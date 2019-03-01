package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_B extends js.Object {
  /** a pawn push of two squares */
  var BIG_PAWN: chessDotJsLib.chessDotJsLibStrings.b
  /** a standard capture */
  var CAPTURE: chessDotJsLib.chessDotJsLibStrings.c
  /** an en passant capture */
  var EP_CAPTURE: chessDotJsLib.chessDotJsLibStrings.e
  /** kingside castling */
  var KSIDE_CASTLE: chessDotJsLib.chessDotJsLibStrings.k
  /** a non-capture */
  var NORMAL: chessDotJsLib.chessDotJsLibStrings.n
  /** a promotion */
  var PROMOTION: chessDotJsLib.chessDotJsLibStrings.p
  /** queenside castling */
  var QSIDE_CASTLE: chessDotJsLib.chessDotJsLibStrings.q
}

object Anon_B {
  @scala.inline
  def apply(
    BIG_PAWN: chessDotJsLib.chessDotJsLibStrings.b,
    CAPTURE: chessDotJsLib.chessDotJsLibStrings.c,
    EP_CAPTURE: chessDotJsLib.chessDotJsLibStrings.e,
    KSIDE_CASTLE: chessDotJsLib.chessDotJsLibStrings.k,
    NORMAL: chessDotJsLib.chessDotJsLibStrings.n,
    PROMOTION: chessDotJsLib.chessDotJsLibStrings.p,
    QSIDE_CASTLE: chessDotJsLib.chessDotJsLibStrings.q
  ): Anon_B = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BIG_PAWN")(BIG_PAWN)
    __obj.updateDynamic("CAPTURE")(CAPTURE)
    __obj.updateDynamic("EP_CAPTURE")(EP_CAPTURE)
    __obj.updateDynamic("KSIDE_CASTLE")(KSIDE_CASTLE)
    __obj.updateDynamic("NORMAL")(NORMAL)
    __obj.updateDynamic("PROMOTION")(PROMOTION)
    __obj.updateDynamic("QSIDE_CASTLE")(QSIDE_CASTLE)
    __obj.asInstanceOf[Anon_B]
  }
}

