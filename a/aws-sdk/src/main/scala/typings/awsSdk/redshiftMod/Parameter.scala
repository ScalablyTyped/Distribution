package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * The valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how to apply the WLM configuration parameter. Some properties can be applied dynamically, while other properties require that any associated clusters be rebooted for the configuration changes to be applied. For more information about parameters and parameter groups, go to Amazon Redshift Parameter Groups in the Amazon Redshift Cluster Management Guide.
    */
  var ApplyType: js.UndefOr[ParameterApplyType] = js.undefined
  
  /**
    * The data type of the parameter.
    */
  var DataType: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the parameter.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed. 
    */
  var IsModifiable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.undefined
  
  /**
    * The source of the parameter value, such as "engine-default" or "user".
    */
  var Source: js.UndefOr[String] = js.undefined
}
object Parameter {
  
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  @scala.inline
  implicit class ParameterMutableBuilder[Self <: Parameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    @scala.inline
    def setApplyType(value: ParameterApplyType): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyTypeUndefined: Self = StObject.set(x, "ApplyType", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIsModifiable(value: Boolean): Self = StObject.set(x, "IsModifiable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModifiableUndefined: Self = StObject.set(x, "IsModifiable", js.undefined)
    
    @scala.inline
    def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    @scala.inline
    def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    @scala.inline
    def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
