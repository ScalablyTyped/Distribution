package typings
package composerDashConcertoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableValidation extends js.Object {
  var disableValidation: js.UndefOr[scala.Boolean] = js.undefined
  var generate: js.UndefOr[java.lang.String] = js.undefined
  var includeOptionalFields: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DisableValidation {
  @scala.inline
  def apply(
    disableValidation: js.UndefOr[scala.Boolean] = js.undefined,
    generate: java.lang.String = null,
    includeOptionalFields: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DisableValidation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableValidation)) __obj.updateDynamic("disableValidation")(disableValidation)
    if (generate != null) __obj.updateDynamic("generate")(generate)
    if (!js.isUndefined(includeOptionalFields)) __obj.updateDynamic("includeOptionalFields")(includeOptionalFields)
    __obj.asInstanceOf[Anon_DisableValidation]
  }
}

