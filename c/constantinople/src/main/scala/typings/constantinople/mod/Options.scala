package typings.constantinople.mod

import typings.babylon.mod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ExpressionToConstantOptions {
  var babylon: js.UndefOr[BabylonOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(babylon: BabylonOptions = null, constants: js.Any = null): Options = {
    val __obj = js.Dynamic.literal()
    if (babylon != null) __obj.updateDynamic("babylon")(babylon.asInstanceOf[js.Any])
    if (constants != null) __obj.updateDynamic("constants")(constants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

