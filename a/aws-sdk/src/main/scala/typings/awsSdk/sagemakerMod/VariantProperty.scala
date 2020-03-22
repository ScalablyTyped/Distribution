package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantProperty extends js.Object {
  /**
    * The type of variant property. The supported values are:    DesiredInstanceCount: Overrides the existing variant instance counts using the InitialInstanceCount values in the ProductionVariants.    DesiredWeight: Overrides the existing variant weights using the InitialVariantWeight values in the ProductionVariants.    DataCaptureConfig: (Not currently supported.)  
    */
  var VariantPropertyType: typings.awsSdk.sagemakerMod.VariantPropertyType = js.native
}

object VariantProperty {
  @scala.inline
  def apply(VariantPropertyType: VariantPropertyType): VariantProperty = {
    val __obj = js.Dynamic.literal(VariantPropertyType = VariantPropertyType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariantProperty]
  }
}

