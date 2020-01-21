package typings.base64Async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(chunkSize: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

