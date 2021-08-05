package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterDefinition extends StObject {
  
  /**
    * A regular expression that represents the patterns to allow for String types.
    */
  var AllowedPattern: js.UndefOr[string] = js.undefined
  
  /**
    * An array containing the list of values allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A string that explains a constraint when the constraint is violated. For example, without a constraint description,
    a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user
    specifies an invalid value:
    Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
    By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you can display
    the following customized error message:
    Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
    
    */
  var ConstraintDescription: js.UndefOr[string] = js.undefined
  
  /**
    * A value of the appropriate type for the template to use if no value is specified when a stack is created.
    If you define constraints for the parameter, you must specify a value that adheres to those constraints.
    */
  var DefaultValue: js.UndefOr[string] = js.undefined
  
  /**
    * A string of up to 4,000 characters that describes the parameter.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * An integer value that determines the largest number of characters that you want to allow for String types.
    */
  var MaxLength: js.UndefOr[integer] = js.undefined
  
  /**
    * A numeric value that determines the largest numeric value that you want to allow for Number types.
    */
  var MaxValue: js.UndefOr[integer] = js.undefined
  
  /**
    * An integer value that determines the smallest number of characters that you want to allow for String types.
    */
  var MinLength: js.UndefOr[integer] = js.undefined
  
  /**
    * A numeric value that determines the smallest numeric value that you want to allow for Number types.
    */
  var MinValue: js.UndefOr[integer] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var Name: string
  
  /**
    * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
    value to true, the parameter value is masked with asterisks (*****).
    */
  var NoEcho: js.UndefOr[boolean] = js.undefined
  
  /**
    * A list of AWS SAM resources that use this parameter.
    */
  var ReferencedByResources: listOfString
  
  /**
    * The type of the parameter.Valid values: String | Number | List&lt;Number> | CommaDelimitedList
    
    String: A literal string.For example, users can specify "MyUserName".
    Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use the
    parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a string.For example, users might specify "8888".
    List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the parameter value as numbers. However, when
    you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a list of strings.For example, users might specify "80,20", and then Ref results in ["80","20"].
    CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should be one more than the total number of commas.
    Also, each member string is space-trimmed.For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
    */
  var Type: js.UndefOr[string] = js.undefined
}
object ParameterDefinition {
  
  inline def apply(Name: string, ReferencedByResources: listOfString): ParameterDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ReferencedByResources = ReferencedByResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDefinition]
  }
  
  extension [Self <: ParameterDefinition](x: Self) {
    
    inline def setAllowedPattern(value: string): Self = StObject.set(x, "AllowedPattern", value.asInstanceOf[js.Any])
    
    inline def setAllowedPatternUndefined: Self = StObject.set(x, "AllowedPattern", js.undefined)
    
    inline def setAllowedValues(value: listOfString): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: string*): Self = StObject.set(x, "AllowedValues", js.Array(value :_*))
    
    inline def setConstraintDescription(value: string): Self = StObject.set(x, "ConstraintDescription", value.asInstanceOf[js.Any])
    
    inline def setConstraintDescriptionUndefined: Self = StObject.set(x, "ConstraintDescription", js.undefined)
    
    inline def setDefaultValue(value: string): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setMaxLength(value: integer): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "MaxLength", js.undefined)
    
    inline def setMaxValue(value: integer): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "MaxValue", js.undefined)
    
    inline def setMinLength(value: integer): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "MinLength", js.undefined)
    
    inline def setMinValue(value: integer): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "MinValue", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNoEcho(value: boolean): Self = StObject.set(x, "NoEcho", value.asInstanceOf[js.Any])
    
    inline def setNoEchoUndefined: Self = StObject.set(x, "NoEcho", js.undefined)
    
    inline def setReferencedByResources(value: listOfString): Self = StObject.set(x, "ReferencedByResources", value.asInstanceOf[js.Any])
    
    inline def setReferencedByResourcesVarargs(value: string*): Self = StObject.set(x, "ReferencedByResources", js.Array(value :_*))
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
