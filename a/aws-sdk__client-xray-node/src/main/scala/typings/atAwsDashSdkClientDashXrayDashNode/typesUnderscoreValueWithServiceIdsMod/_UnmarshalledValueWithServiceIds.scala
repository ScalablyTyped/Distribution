package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreValueWithServiceIdsMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreAnnotationValueMod._UnmarshalledAnnotationValue
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceIdMod._UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledValueWithServiceIds extends _ValueWithServiceIds {
  /**
    * <p>Values of the annotation.</p>
    */
  @JSName("AnnotationValue")
  var AnnotationValue__UnmarshalledValueWithServiceIds: js.UndefOr[_UnmarshalledAnnotationValue] = js.undefined
  /**
    * <p>Services to which the annotation applies.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds__UnmarshalledValueWithServiceIds: js.UndefOr[js.Array[_UnmarshalledServiceId]] = js.undefined
}

object _UnmarshalledValueWithServiceIds {
  @scala.inline
  def apply(
    AnnotationValue: _UnmarshalledAnnotationValue = null,
    ServiceIds: js.Array[_UnmarshalledServiceId] = null
  ): _UnmarshalledValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    if (AnnotationValue != null) __obj.updateDynamic("AnnotationValue")(AnnotationValue.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledValueWithServiceIds]
  }
}

