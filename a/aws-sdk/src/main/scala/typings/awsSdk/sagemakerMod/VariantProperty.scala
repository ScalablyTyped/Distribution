package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantProperty extends js.Object {
  /**
    * The type of variant property. The supported values are:    DesiredInstanceCount: Overrides the existing variant instance counts using the ProductionVariant$InitialInstanceCount values in the CreateEndpointConfigInput$ProductionVariants.    DesiredWeight: Overrides the existing variant weights using the ProductionVariant$InitialVariantWeight values in the CreateEndpointConfigInput$ProductionVariants.    DataCaptureConfig: (Not currently supported.)  
    */
  var VariantPropertyType: typings.awsSdk.sagemakerMod.VariantPropertyType = js.native
}

object VariantProperty {
  @scala.inline
  def apply(VariantPropertyType: VariantPropertyType): VariantProperty = {
    val __obj = js.Dynamic.literal(VariantPropertyType = VariantPropertyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantProperty]
  }
  @scala.inline
  implicit class VariantPropertyOps[Self <: VariantProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVariantPropertyType(value: VariantPropertyType): Self = this.set("VariantPropertyType", value.asInstanceOf[js.Any])
  }
  
}

