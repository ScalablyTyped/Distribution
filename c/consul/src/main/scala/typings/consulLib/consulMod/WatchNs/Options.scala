package typings
package consulLib.consulMod.WatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var method: js.Function
  var options: js.UndefOr[consulLib.consulMod.CommonOptions with WatchOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(method: js.Function, options: consulLib.consulMod.CommonOptions with WatchOptions = null): Options = {
    val __obj = js.Dynamic.literal(method = method)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Options]
  }
}

