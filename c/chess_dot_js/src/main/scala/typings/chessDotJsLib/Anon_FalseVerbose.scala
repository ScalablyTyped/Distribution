package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FalseVerbose extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[chessDotJsLib.chessDotJsLibNumbers.`false`] = js.undefined
}

object Anon_FalseVerbose {
  @scala.inline
  def apply(verbose: chessDotJsLib.chessDotJsLibNumbers.`false` = null): Anon_FalseVerbose = {
    val __obj = js.Dynamic.literal()
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_FalseVerbose]
  }
}

