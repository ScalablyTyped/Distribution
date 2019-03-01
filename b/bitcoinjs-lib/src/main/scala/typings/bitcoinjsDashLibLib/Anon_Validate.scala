package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Validate extends js.Object {
  var validate: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Validate {
  @scala.inline
  def apply(validate: js.UndefOr[scala.Boolean] = js.undefined): Anon_Validate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Anon_Validate]
  }
}

