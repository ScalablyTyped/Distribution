package typings.chessDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sloppy extends js.Object {
  /**
    * An optional sloppy flag can be used to parse a variety of
    * non-standard move notations.
    */
  var sloppy: js.UndefOr[Boolean] = js.undefined
}

object Anon_Sloppy {
  @scala.inline
  def apply(sloppy: js.UndefOr[Boolean] = js.undefined): Anon_Sloppy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(sloppy)) __obj.updateDynamic("sloppy")(sloppy)
    __obj.asInstanceOf[Anon_Sloppy]
  }
}

