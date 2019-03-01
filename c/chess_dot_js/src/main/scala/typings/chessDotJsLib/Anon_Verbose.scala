package typings
package chessDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Verbose extends js.Object {
  /**
    * Pass true if you want this function to output verbose objects
    * instead of strings.
    */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Verbose {
  @scala.inline
  def apply(verbose: js.UndefOr[scala.Boolean] = js.undefined): Anon_Verbose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Anon_Verbose]
  }
}

