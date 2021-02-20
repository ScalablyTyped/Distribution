package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterSpecification extends StObject {
  
  /**
    * The default value for this hyperparameter. If a default value is specified, a hyperparameter cannot be required.
    */
  var DefaultValue: js.UndefOr[HyperParameterValue] = js.native
  
  /**
    * A brief description of the hyperparameter.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  
  /**
    * Indicates whether this hyperparameter is required.
    */
  var IsRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether this hyperparameter is tunable in a hyperparameter tuning job.
    */
  var IsTunable: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of this hyperparameter. The name must be unique.
    */
  var Name: ParameterName = js.native
  
  /**
    * The allowed range for this hyperparameter.
    */
  var Range: js.UndefOr[ParameterRange] = js.native
  
  /**
    * The type of this hyperparameter. The valid types are Integer, Continuous, Categorical, and FreeText.
    */
  var Type: ParameterType = js.native
}
object HyperParameterSpecification {
  
  @scala.inline
  def apply(Name: ParameterName, Type: ParameterType): HyperParameterSpecification = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterSpecification]
  }
  
  @scala.inline
  implicit class HyperParameterSpecificationMutableBuilder[Self <: HyperParameterSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: HyperParameterValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = StObject.set(x, "IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRequiredUndefined: Self = StObject.set(x, "IsRequired", js.undefined)
    
    @scala.inline
    def setIsTunable(value: Boolean): Self = StObject.set(x, "IsTunable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTunableUndefined: Self = StObject.set(x, "IsTunable", js.undefined)
    
    @scala.inline
    def setName(value: ParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: ParameterRange): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    
    @scala.inline
    def setType(value: ParameterType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
