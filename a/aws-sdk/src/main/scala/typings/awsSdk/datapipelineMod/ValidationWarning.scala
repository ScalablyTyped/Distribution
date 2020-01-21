package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationWarning extends js.Object {
  /**
    * The identifier of the object that contains the validation warning.
    */
  var id: js.UndefOr[typings.awsSdk.datapipelineMod.id] = js.native
  /**
    * A description of the validation warning.
    */
  var warnings: js.UndefOr[validationMessages] = js.native
}

object ValidationWarning {
  @scala.inline
  def apply(id: id = null, warnings: validationMessages = null): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationWarning]
  }
}

