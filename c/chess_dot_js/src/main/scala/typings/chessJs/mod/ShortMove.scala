package typings.chessJs.mod

import typings.chessJs.chessJsStrings.p
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortMove extends js.Object {
  /**
    * The location the piece is moving from.
    * Must be in san format, e.g "h8"
    */
  var from: Square
  /**
    * If this move results in a promotion, this will have the unit promotion.
    */
  var promotion: js.UndefOr[Exclude[PieceType, p]] = js.undefined
  /**
    * The location the piece is moving to.
    * Must be in san format, e.g "a1"
    */
  var to: Square
}

object ShortMove {
  @scala.inline
  def apply(from: Square, to: Square, promotion: Exclude[PieceType, p] = null): ShortMove = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (promotion != null) __obj.updateDynamic("promotion")(promotion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortMove]
  }
}

