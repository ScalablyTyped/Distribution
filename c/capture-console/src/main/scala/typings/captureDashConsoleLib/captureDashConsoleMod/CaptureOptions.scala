package typings
package captureDashConsoleLib.captureDashConsoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /**
    * Option to silence the output going to the console
    */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(quiet: js.UndefOr[scala.Boolean] = js.undefined): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    __obj.asInstanceOf[CaptureOptions]
  }
}

