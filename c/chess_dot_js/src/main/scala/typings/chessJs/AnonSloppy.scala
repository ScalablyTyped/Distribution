package typings.chessJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSloppy extends js.Object {
  /**
    * An optional sloppy flag can be used to parse a variety of
    * non-standard move notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.undefined
}

object AnonSloppy {
  @scala.inline
  def apply(sloppy: js.UndefOr[Boolean] = js.undefined): AnonSloppy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sloppy)) __obj.updateDynamic("sloppy")(sloppy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSloppy]
  }
}

