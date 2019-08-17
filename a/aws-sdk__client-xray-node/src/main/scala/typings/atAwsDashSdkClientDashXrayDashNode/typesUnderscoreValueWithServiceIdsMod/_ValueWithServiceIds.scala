package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreValueWithServiceIdsMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreAnnotationValueMod._AnnotationValue
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod._ServiceId
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ValueWithServiceIds extends js.Object {
  /**
    * <p>Values of the annotation.</p>
    */
  var AnnotationValue: js.UndefOr[_AnnotationValue] = js.undefined
  /**
    * <p>Services to which the annotation applies.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[_ServiceId] | Iterable[_ServiceId]] = js.undefined
}

object _ValueWithServiceIds {
  @scala.inline
  def apply(
    AnnotationValue: _AnnotationValue = null,
    ServiceIds: js.Array[_ServiceId] | Iterable[_ServiceId] = null
  ): _ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    if (AnnotationValue != null) __obj.updateDynamic("AnnotationValue")(AnnotationValue)
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ValueWithServiceIds]
  }
}

