package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyAttributeTypeDescription extends StObject {
  
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.elbMod.AttributeName] = js.native
  
  /**
    * The type of the attribute. For example, Boolean or Integer.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.elbMod.AttributeType] = js.native
  
  /**
    * The cardinality of the attribute. Valid values:   ONE(1) : Single value required   ZERO_OR_ONE(0..1) : Up to one value is allowed   ZERO_OR_MORE(0..*) : Optional. Multiple values are allowed   ONE_OR_MORE(1..*0) : Required. Multiple values are allowed  
    */
  var Cardinality: js.UndefOr[typings.awsSdk.elbMod.Cardinality] = js.native
  
  /**
    * The default value of the attribute, if applicable.
    */
  var DefaultValue: js.UndefOr[typings.awsSdk.elbMod.DefaultValue] = js.native
  
  /**
    * A description of the attribute.
    */
  var Description: js.UndefOr[typings.awsSdk.elbMod.Description] = js.native
}
object PolicyAttributeTypeDescription {
  
  @scala.inline
  def apply(): PolicyAttributeTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyAttributeTypeDescription]
  }
  
  @scala.inline
  implicit class PolicyAttributeTypeDescriptionMutableBuilder[Self <: PolicyAttributeTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: AttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
    
    @scala.inline
    def setCardinality(value: Cardinality): Self = StObject.set(x, "Cardinality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardinalityUndefined: Self = StObject.set(x, "Cardinality", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: DefaultValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
