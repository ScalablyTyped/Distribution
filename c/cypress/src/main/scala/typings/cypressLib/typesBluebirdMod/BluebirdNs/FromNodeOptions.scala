package typings
package cypressLib.typesBluebirdMod.BluebirdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromNodeOptions extends js.Object {
  var multiArgs: js.UndefOr[scala.Boolean] = js.undefined
}

object FromNodeOptions {
  @scala.inline
  def apply(multiArgs: js.UndefOr[scala.Boolean] = js.undefined): FromNodeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    __obj.asInstanceOf[FromNodeOptions]
  }
}

