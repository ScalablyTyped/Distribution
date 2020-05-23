package typings.captureConsole.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /**
    * Option to silence the output going to the console
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(quiet: js.UndefOr[Boolean] = js.undefined): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
}

