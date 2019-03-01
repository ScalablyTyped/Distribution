package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validable extends js.Object {
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object Validable {
  @scala.inline
  def apply(validate: js.UndefOr[scala.Boolean] = js.undefined): Validable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Validable]
  }
}

