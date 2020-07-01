package typings.copyWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Limits the number of simultaneous requests to fs
    * @default 100
    */
  var concurrency: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(concurrency: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

