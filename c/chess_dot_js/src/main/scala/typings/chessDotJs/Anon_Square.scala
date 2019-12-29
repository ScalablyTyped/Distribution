package typings.chessDotJs

import typings.chessDotJs.chessDotJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Square extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[String] = js.undefined
  /** Set to true to return verbose move objects instead of strings */
  var verbose: `true`
}

object Anon_Square {
  @scala.inline
  def apply(verbose: `true`, square: String = null): Anon_Square = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    if (square != null) __obj.updateDynamic("square")(square.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Square]
  }
}

