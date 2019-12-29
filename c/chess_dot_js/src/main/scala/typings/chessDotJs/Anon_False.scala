package typings.chessDotJs

import typings.chessDotJs.chessDotJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.undefined
  /** Set to true to return verbose move objects instead of strings */
  var verbose: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(square: String = null, verbose: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (square != null) __obj.updateDynamic("square")(square.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

