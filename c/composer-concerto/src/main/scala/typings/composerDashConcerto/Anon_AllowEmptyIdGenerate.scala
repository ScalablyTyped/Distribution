package typings.composerDashConcerto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmptyIdGenerate extends js.Object {
  var allowEmptyId: js.UndefOr[Boolean] = js.undefined
  var generate: js.UndefOr[String] = js.undefined
  var includeOptionalFields: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowEmptyIdGenerate {
  @scala.inline
  def apply(
    allowEmptyId: js.UndefOr[Boolean] = js.undefined,
    generate: String = null,
    includeOptionalFields: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowEmptyIdGenerate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyId)) __obj.updateDynamic("allowEmptyId")(allowEmptyId)
    if (generate != null) __obj.updateDynamic("generate")(generate)
    if (!js.isUndefined(includeOptionalFields)) __obj.updateDynamic("includeOptionalFields")(includeOptionalFields)
    __obj.asInstanceOf[Anon_AllowEmptyIdGenerate]
  }
}

