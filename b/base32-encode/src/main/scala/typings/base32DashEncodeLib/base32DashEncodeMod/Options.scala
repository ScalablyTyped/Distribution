package typings
package base32DashEncodeLib.base32DashEncodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var padding: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(padding: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[Options]
  }
}

