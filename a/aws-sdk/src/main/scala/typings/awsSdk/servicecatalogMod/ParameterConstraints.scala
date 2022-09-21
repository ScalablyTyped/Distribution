package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterConstraints extends StObject {
  
  /**
    * A regular expression that represents the patterns that allow for String types. The pattern must match the entire parameter value provided.
    */
  var AllowedPattern: js.UndefOr[String] = js.undefined
  
  /**
    * The values that the administrator has allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[typings.awsSdk.servicecatalogMod.AllowedValues] = js.undefined
  
  /**
    * A string that explains a constraint when the constraint is violated. For example, without a constraint description, a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user specifies an invalid value:  Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+  By adding a constraint description, such as must only contain letters (uppercase and lowercase) and numbers, you can display the following customized error message:  Malformed input-Parameter MyParameter must only contain uppercase and lowercase letters and numbers. 
    */
  var ConstraintDescription: js.UndefOr[String] = js.undefined
  
  /**
    * An integer value that determines the largest number of characters you want to allow for String types. 
    */
  var MaxLength: js.UndefOr[String] = js.undefined
  
  /**
    * A numeric value that determines the largest numeric value you want to allow for Number types.
    */
  var MaxValue: js.UndefOr[String] = js.undefined
  
  /**
    * An integer value that determines the smallest number of characters you want to allow for String types.
    */
  var MinLength: js.UndefOr[String] = js.undefined
  
  /**
    * A numeric value that determines the smallest numeric value you want to allow for Number types. 
    */
  var MinValue: js.UndefOr[String] = js.undefined
}
object ParameterConstraints {
  
  inline def apply(): ParameterConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterConstraints]
  }
  
  extension [Self <: ParameterConstraints](x: Self) {
    
    inline def setAllowedPattern(value: String): Self = StObject.set(x, "AllowedPattern", value.asInstanceOf[js.Any])
    
    inline def setAllowedPatternUndefined: Self = StObject.set(x, "AllowedPattern", js.undefined)
    
    inline def setAllowedValues(value: AllowedValues): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "AllowedValues", js.Array(value*))
    
    inline def setConstraintDescription(value: String): Self = StObject.set(x, "ConstraintDescription", value.asInstanceOf[js.Any])
    
    inline def setConstraintDescriptionUndefined: Self = StObject.set(x, "ConstraintDescription", js.undefined)
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "MaxLength", js.undefined)
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "MaxValue", js.undefined)
    
    inline def setMinLength(value: String): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "MinLength", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "MinValue", js.undefined)
  }
}
