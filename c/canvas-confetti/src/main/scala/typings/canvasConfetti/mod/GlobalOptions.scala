package typings.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOptions extends js.Object {
  /**
    * Whether to allow setting the canvas image size, as well as keep it correctly sized if the window changes size
    * @default false
    */
  var resize: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use an asynchronous web worker to render the confetti animation, whenever possible
    * @default false
    */
  var useWorker: js.UndefOr[Boolean] = js.undefined
}

object GlobalOptions {
  @scala.inline
  def apply(resize: js.UndefOr[Boolean] = js.undefined, useWorker: js.UndefOr[Boolean] = js.undefined): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalOptions]
  }
}

