package typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod

import typings.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue
import typings.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueWithServiceIds extends js.Object {
  /**
    * <p>Values of the annotation.</p>
    */
  var AnnotationValue: js.UndefOr[typings.awsSdkClientXrayNode.typesAnnotationValueMod.AnnotationValue] = js.native
  /**
    * <p>Services to which the annotation applies.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | Iterable[ServiceId]] = js.native
}

object ValueWithServiceIds {
  @scala.inline
  def apply(): ValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueWithServiceIds]
  }
  @scala.inline
  implicit class ValueWithServiceIdsOps[Self <: ValueWithServiceIds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnnotationValue(value: AnnotationValue): Self = this.set("AnnotationValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationValue: Self = this.set("AnnotationValue", js.undefined)
    @scala.inline
    def setServiceIdsVarargs(value: ServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    @scala.inline
    def setServiceIds(value: js.Array[ServiceId] | Iterable[ServiceId]): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
  }
  
}

