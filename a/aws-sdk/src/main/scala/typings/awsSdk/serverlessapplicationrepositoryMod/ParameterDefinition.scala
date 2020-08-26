package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterDefinition extends js.Object {
  /**
    * A regular expression that represents the patterns to allow for String types.
    */
  var AllowedPattern: js.UndefOr[string] = js.native
  /**
    * An array containing the list of values allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[listOfString] = js.native
  /**
    * A string that explains a constraint when the constraint is violated. For example, without a constraint description,
    a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user
    specifies an invalid value:
    Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
    By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you can display
    the following customized error message:
    Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
    
    */
  var ConstraintDescription: js.UndefOr[string] = js.native
  /**
    * A value of the appropriate type for the template to use if no value is specified when a stack is created.
    If you define constraints for the parameter, you must specify a value that adheres to those constraints.
    */
  var DefaultValue: js.UndefOr[string] = js.native
  /**
    * A string of up to 4,000 characters that describes the parameter.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * An integer value that determines the largest number of characters that you want to allow for String types.
    */
  var MaxLength: js.UndefOr[integer] = js.native
  /**
    * A numeric value that determines the largest numeric value that you want to allow for Number types.
    */
  var MaxValue: js.UndefOr[integer] = js.native
  /**
    * An integer value that determines the smallest number of characters that you want to allow for String types.
    */
  var MinLength: js.UndefOr[integer] = js.native
  /**
    * A numeric value that determines the smallest numeric value that you want to allow for Number types.
    */
  var MinValue: js.UndefOr[integer] = js.native
  /**
    * The name of the parameter.
    */
  var Name: string = js.native
  /**
    * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
    value to true, the parameter value is masked with asterisks (*****).
    */
  var NoEcho: js.UndefOr[boolean] = js.native
  /**
    * A list of AWS SAM resources that use this parameter.
    */
  var ReferencedByResources: listOfString = js.native
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
  var Type: js.UndefOr[string] = js.native
}

object ParameterDefinition {
  @scala.inline
  def apply(Name: string, ReferencedByResources: listOfString): ParameterDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ReferencedByResources = ReferencedByResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDefinition]
  }
  @scala.inline
  implicit class ParameterDefinitionOps[Self <: ParameterDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferencedByResourcesVarargs(value: string*): Self = this.set("ReferencedByResources", js.Array(value :_*))
    @scala.inline
    def setReferencedByResources(value: listOfString): Self = this.set("ReferencedByResources", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowedPattern(value: string): Self = this.set("AllowedPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedPattern: Self = this.set("AllowedPattern", js.undefined)
    @scala.inline
    def setAllowedValuesVarargs(value: string*): Self = this.set("AllowedValues", js.Array(value :_*))
    @scala.inline
    def setAllowedValues(value: listOfString): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
    @scala.inline
    def setConstraintDescription(value: string): Self = this.set("ConstraintDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraintDescription: Self = this.set("ConstraintDescription", js.undefined)
    @scala.inline
    def setDefaultValue(value: string): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setMaxLength(value: integer): Self = this.set("MaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("MaxLength", js.undefined)
    @scala.inline
    def setMaxValue(value: integer): Self = this.set("MaxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("MaxValue", js.undefined)
    @scala.inline
    def setMinLength(value: integer): Self = this.set("MinLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("MinLength", js.undefined)
    @scala.inline
    def setMinValue(value: integer): Self = this.set("MinValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("MinValue", js.undefined)
    @scala.inline
    def setNoEcho(value: boolean): Self = this.set("NoEcho", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEcho: Self = this.set("NoEcho", js.undefined)
    @scala.inline
    def setType(value: string): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

