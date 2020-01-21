package typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod

import typings.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue
import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueWithServiceIds extends js.Object {
  /**
    * <p>Values of the annotation.</p>
    */
  var AnnotationValue: js.UndefOr[typings.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue] = js.undefined
  /**
    * <p>Services to which the annotation applies.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.undefined
}

object ValueWithServiceIds {
  @scala.inline
  def apply(
    AnnotationValue: AnnotationValue = null,
    ServiceIds: js.Array[ServiceId] | Iterable[ServiceId] = null
  ): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    if (AnnotationValue != null) __obj.updateDynamic("AnnotationValue")(AnnotationValue.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueWithServiceIds]
  }
}

