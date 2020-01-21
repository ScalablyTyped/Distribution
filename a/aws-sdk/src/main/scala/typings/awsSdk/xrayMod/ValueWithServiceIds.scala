package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueWithServiceIds extends js.Object {
  /**
    * Values of the annotation.
    */
  var AnnotationValue: js.UndefOr[typings.awsSdk.xrayMod.AnnotationValue] = js.native
  /**
    * Services to which the annotation applies.
    */
  var ServiceIds: js.UndefOr[typings.awsSdk.xrayMod.ServiceIds] = js.native
}

object ValueWithServiceIds {
  @scala.inline
  def apply(AnnotationValue: AnnotationValue = null, ServiceIds: ServiceIds = null): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    if (AnnotationValue != null) __obj.updateDynamic("AnnotationValue")(AnnotationValue.asInstanceOf[js.Any])
    if (ServiceIds != null) __obj.updateDynamic("ServiceIds")(ServiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueWithServiceIds]
  }
}

