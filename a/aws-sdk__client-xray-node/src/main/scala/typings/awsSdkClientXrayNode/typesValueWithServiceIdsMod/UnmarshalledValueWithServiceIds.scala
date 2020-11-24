package typings.awsSdkClientXrayNode.typesValueWithServiceIdsMod

import typings.awsSdkClientXrayNode.typesAnnotationValueMod.UnmarshalledAnnotationValue
import typings.awsSdkClientXrayNode.typesServiceIdMod.UnmarshalledServiceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledValueWithServiceIds extends ValueWithServiceIds {
  
  /**
    * <p>Values of the annotation.</p>
    */
  @JSName("AnnotationValue")
  var AnnotationValue_UnmarshalledValueWithServiceIds: js.UndefOr[UnmarshalledAnnotationValue] = js.native
  
  /**
    * <p>Services to which the annotation applies.</p>
    */
  @JSName("ServiceIds")
  var ServiceIds_UnmarshalledValueWithServiceIds: js.UndefOr[js.Array[UnmarshalledServiceId]] = js.native
}
object UnmarshalledValueWithServiceIds {
  
  @scala.inline
  def apply(): UnmarshalledValueWithServiceIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledValueWithServiceIds]
  }
  
  @scala.inline
  implicit class UnmarshalledValueWithServiceIdsOps[Self <: UnmarshalledValueWithServiceIds] (val x: Self) extends AnyVal {
    
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
    def setAnnotationValue(value: UnmarshalledAnnotationValue): Self = this.set("AnnotationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationValue: Self = this.set("AnnotationValue", js.undefined)
    
    @scala.inline
    def setServiceIdsVarargs(value: UnmarshalledServiceId*): Self = this.set("ServiceIds", js.Array(value :_*))
    
    @scala.inline
    def setServiceIds(value: js.Array[UnmarshalledServiceId]): Self = this.set("ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceIds: Self = this.set("ServiceIds", js.undefined)
  }
}
