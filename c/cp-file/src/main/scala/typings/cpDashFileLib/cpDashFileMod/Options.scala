package typings
package cpDashFileLib.cpDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  	 * Overwrite existing file.
  	 *
  	 * @default true
  	 */
  val overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(overwrite: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[Options]
  }
}

