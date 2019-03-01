package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Square extends js.Object {
  /**
    * The string to test if it is a valid move, if it is not then an
    * empty array is returned
    */
  var square: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true to return verbose move objects instead of strings */
  var verbose: chessDotJsLib.chessDotJsLibNumbers.`true`
}

object Anon_Square {
  @scala.inline
  def apply(verbose: chessDotJsLib.chessDotJsLibNumbers.`true`, square: java.lang.String = null): Anon_Square = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("verbose")(verbose)
    if (square != null) __obj.updateDynamic("square")(square)
    __obj.asInstanceOf[Anon_Square]
  }
}

