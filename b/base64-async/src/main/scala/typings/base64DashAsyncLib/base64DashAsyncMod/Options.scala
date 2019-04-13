package typings
package base64DashAsyncLib.base64DashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(chunkSize: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

