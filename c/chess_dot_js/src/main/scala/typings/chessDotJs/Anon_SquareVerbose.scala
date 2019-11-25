package typings.chessDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SquareVerbose extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.undefined
  /** Set to true to return verbose move objects instead of strings */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Anon_SquareVerbose {
  @scala.inline
  def apply(square: String = null, verbose: js.UndefOr[Boolean] = js.undefined): Anon_SquareVerbose = {
    val __obj = js.Dynamic.literal()
    if (square != null) __obj.updateDynamic("square")(square.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SquareVerbose]
  }
}

