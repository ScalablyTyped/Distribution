package typings.backbone.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validable extends js.Object {
  var validate: js.UndefOr[Boolean] = js.undefined
}

object Validable {
  @scala.inline
  def apply(validate: js.UndefOr[Boolean] = js.undefined): Validable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validable]
  }
}

