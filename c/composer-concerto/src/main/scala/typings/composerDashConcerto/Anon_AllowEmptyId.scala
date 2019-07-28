package typings.composerDashConcerto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmptyId extends js.Object {
  var allowEmptyId: js.UndefOr[Boolean] = js.undefined
  var disableValidation: js.UndefOr[Boolean] = js.undefined
  var generate: js.UndefOr[String] = js.undefined
  var includeOptionalFields: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowEmptyId {
  @scala.inline
  def apply(
    allowEmptyId: js.UndefOr[Boolean] = js.undefined,
    disableValidation: js.UndefOr[Boolean] = js.undefined,
    generate: String = null,
    includeOptionalFields: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowEmptyId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyId)) __obj.updateDynamic("allowEmptyId")(allowEmptyId)
    if (!js.isUndefined(disableValidation)) __obj.updateDynamic("disableValidation")(disableValidation)
    if (generate != null) __obj.updateDynamic("generate")(generate)
    if (!js.isUndefined(includeOptionalFields)) __obj.updateDynamic("includeOptionalFields")(includeOptionalFields)
    __obj.asInstanceOf[Anon_AllowEmptyId]
  }
}

