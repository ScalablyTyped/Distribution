package typings.base64Async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(chunkSize: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

