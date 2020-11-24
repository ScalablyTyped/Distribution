package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperParameterSpecification extends js.Object {
  
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
  implicit class HyperParameterSpecificationOps[Self <: HyperParameterSpecification] (val x: Self) extends AnyVal {
    
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
    def setName(value: ParameterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ParameterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: HyperParameterValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsRequired(value: Boolean): Self = this.set("IsRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequired: Self = this.set("IsRequired", js.undefined)
    
    @scala.inline
    def setIsTunable(value: Boolean): Self = this.set("IsTunable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTunable: Self = this.set("IsTunable", js.undefined)
    
    @scala.inline
    def setRange(value: ParameterRange): Self = this.set("Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("Range", js.undefined)
  }
}
