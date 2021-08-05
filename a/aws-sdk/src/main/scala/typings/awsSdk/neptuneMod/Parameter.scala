package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * Specifies the valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates when to apply parameter updates.
    */
  var ApplyMethod: js.UndefOr[typings.awsSdk.neptuneMod.ApplyMethod] = js.undefined
  
  /**
    * Specifies the engine specific parameters type.
    */
  var ApplyType: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.undefined
  
  /**
    * Provides a description of the parameter.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    *  Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The earliest engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the source of the parameter value.
    */
  var Source: js.UndefOr[String] = js.undefined
}
object Parameter {
  
  inline def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setApplyMethod(value: ApplyMethod): Self = StObject.set(x, "ApplyMethod", value.asInstanceOf[js.Any])
    
    inline def setApplyMethodUndefined: Self = StObject.set(x, "ApplyMethod", js.undefined)
    
    inline def setApplyType(value: String): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    inline def setApplyTypeUndefined: Self = StObject.set(x, "ApplyType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsModifiable(value: Boolean): Self = StObject.set(x, "IsModifiable", value.asInstanceOf[js.Any])
    
    inline def setIsModifiableUndefined: Self = StObject.set(x, "IsModifiable", js.undefined)
    
    inline def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    inline def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
