package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptionsConfiguration extends js.Object {
  var validateOnAttach: js.UndefOr[Boolean] = js.undefined
  var validateOnPropertyChange: js.UndefOr[Boolean] = js.undefined
  var validateOnQuery: js.UndefOr[Boolean] = js.undefined
  var validateOnSave: js.UndefOr[Boolean] = js.undefined
}

object ValidationOptionsConfiguration {
  @scala.inline
  def apply(
    validateOnAttach: js.UndefOr[Boolean] = js.undefined,
    validateOnPropertyChange: js.UndefOr[Boolean] = js.undefined,
    validateOnQuery: js.UndefOr[Boolean] = js.undefined,
    validateOnSave: js.UndefOr[Boolean] = js.undefined
  ): ValidationOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validateOnAttach)) __obj.updateDynamic("validateOnAttach")(validateOnAttach)
    if (!js.isUndefined(validateOnPropertyChange)) __obj.updateDynamic("validateOnPropertyChange")(validateOnPropertyChange)
    if (!js.isUndefined(validateOnQuery)) __obj.updateDynamic("validateOnQuery")(validateOnQuery)
    if (!js.isUndefined(validateOnSave)) __obj.updateDynamic("validateOnSave")(validateOnSave)
    __obj.asInstanceOf[ValidationOptionsConfiguration]
  }
}

