package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true to return verbose move objects instead of strings */
  var verbose: js.UndefOr[chessDotJsLib.chessDotJsLibNumbers.`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(square: java.lang.String = null, verbose: chessDotJsLib.chessDotJsLibNumbers.`false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (square != null) __obj.updateDynamic("square")(square)
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_False]
  }
}

