package typings.constantinople.constantinopleMod

import typings.babylon.babylonMod.BabylonOptions
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
    if (babylon != null) __obj.updateDynamic("babylon")(babylon)
    if (constants != null) __obj.updateDynamic("constants")(constants)
    __obj.asInstanceOf[Options]
  }
}

