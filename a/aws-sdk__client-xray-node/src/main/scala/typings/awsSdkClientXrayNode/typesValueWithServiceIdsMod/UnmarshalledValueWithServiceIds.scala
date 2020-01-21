package typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod

import typings.awsSdkClientXrayNode.typesAnnotationValueMod.UnmarshalledAnnotationValue
import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledValueWithServiceIds extends ValueWithServiceIds {
  /**
    * <p>Values of the annotation.</p>
    */
  @JSName("AnnotationValue")
  var AnnotationValue_UnmarshalledValueWithServiceIds: js.UndefOr[UnmarshalledAnnotationValue] = js.undefined
  /**
    * <p>Services to which the annotation applies.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledValueWithServiceIds: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.undefined
}

object UnmarshalledValueWithServiceIds {
  @scala.inline
  def apply(
    AnnotationValue: UnmarshalledAnnotationValue = null,
    ServiceIds: js.Array[UnmarshalledServiceId] = null
  ): UnmarshalledValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    if (AnnotationValue != null) __obj.updateDynamic("AnnotationValue")(AnnotationValue.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledValueWithServiceIds]
  }
}

