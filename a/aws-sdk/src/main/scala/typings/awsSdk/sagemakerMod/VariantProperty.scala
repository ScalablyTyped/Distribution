package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariantProperty extends StObject {
  
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
  implicit class VariantPropertyMutableBuilder[Self <: VariantProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariantPropertyType(value: VariantPropertyType): Self = StObject.set(x, "VariantPropertyType", value.asInstanceOf[js.Any])
  }
}
