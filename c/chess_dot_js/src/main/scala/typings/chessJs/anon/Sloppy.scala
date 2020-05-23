package typings.chessJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sloppy extends js.Object {
  /**
    * An optional sloppy flag can be used to parse a variety of
    * non-standard move notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.undefined
}

object Sloppy {
  @scala.inline
  def apply(sloppy: js.UndefOr[Boolean] = js.undefined): Sloppy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sloppy)) __obj.updateDynamic("sloppy")(sloppy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sloppy]
  }
}

