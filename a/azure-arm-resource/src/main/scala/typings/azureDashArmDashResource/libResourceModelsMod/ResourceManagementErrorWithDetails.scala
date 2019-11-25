package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceManagementErrorWithDetails extends js.Object {
  /**
    * The error code returned when exporting the template.
    */
  val code: js.UndefOr[String] = js.undefined
  /**
    * Validation error.
    */
  val details: js.UndefOr[js.Array[ResourceManagementErrorWithDetails]] = js.undefined
  /**
    * The error message describing the export error.
    */
  val message: js.UndefOr[String] = js.undefined
  /**
    * The target of the error.
    */
  val target: js.UndefOr[String] = js.undefined
}

object ResourceManagementErrorWithDetails {
  @scala.inline
  def apply(
    code: String = null,
    details: js.Array[ResourceManagementErrorWithDetails] = null,
    message: String = null,
    target: String = null
  ): ResourceManagementErrorWithDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceManagementErrorWithDetails]
  }
}

