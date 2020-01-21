package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SanitizationWarning extends js.Object {
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[string] = js.native
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[string] = js.native
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: js.UndefOr[SanitizationWarningReason] = js.native
}

object SanitizationWarning {
  @scala.inline
  def apply(AttributeName: string = null, ElementName: string = null, Reason: SanitizationWarningReason = null): SanitizationWarning = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (ElementName != null) __obj.updateDynamic("ElementName")(ElementName.asInstanceOf[js.Any])
    if (Reason != null) __obj.updateDynamic("Reason")(Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizationWarning]
  }
}

