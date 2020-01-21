package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationOptionDescription extends js.Object {
  /**
    * An indication of which action is required if the value for this configuration option changes:    NoInterruption : There is no interruption to the environment or application availability.    RestartEnvironment : The environment is entirely restarted, all AWS resources are deleted and recreated, and the environment is unavailable during the process.    RestartApplicationServer : The environment is available the entire time. However, a short application outage occurs when the application servers on the running Amazon EC2 instances are restarted.  
    */
  var ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.native
  /**
    * The default value for this configuration option.
    */
  var DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.native
  /**
    * If specified, the configuration option must be a string value no longer than this value.
    */
  var MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.native
  /**
    * If specified, the configuration option must be a numeric value less than this value.
    */
  var MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.native
  /**
    * If specified, the configuration option must be a numeric value greater than this value.
    */
  var MinValue: js.UndefOr[OptionRestrictionMinValue] = js.native
  /**
    * The name of the configuration option.
    */
  var Name: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * If specified, the configuration option must be a string value that satisfies this regular expression.
    */
  var Regex: js.UndefOr[OptionRestrictionRegex] = js.native
  /**
    * An indication of whether the user defined this configuration option:    true : This configuration option was defined by the user. It is a valid choice for specifying if this as an Option to Remove when updating configuration settings.     false : This configuration was not defined by the user.    Constraint: You can remove only UserDefined options from a configuration.   Valid Values: true | false 
    */
  var UserDefined: js.UndefOr[UserDefinedOption] = js.native
  /**
    * If specified, values for the configuration option are selected from this list.
    */
  var ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.native
  /**
    * An indication of which type of values this option has and whether it is allowable to select one or more than one of the possible values:    Scalar : Values for this option are a single selection from the possible values, or an unformatted string, or numeric value governed by the MIN/MAX/Regex constraints.    List : Values for this option are multiple selections from the possible values.    Boolean : Values for this option are either true or false .    Json : Values for this option are a JSON representation of a ConfigDocument.  
    */
  var ValueType: js.UndefOr[ConfigurationOptionValueType] = js.native
}

object ConfigurationOptionDescription {
  @scala.inline
  def apply(
    ChangeSeverity: ConfigurationOptionSeverity = null,
    DefaultValue: ConfigurationOptionDefaultValue = null,
    MaxLength: Int | Double = null,
    MaxValue: Int | Double = null,
    MinValue: Int | Double = null,
    Name: ConfigurationOptionName = null,
    Namespace: OptionNamespace = null,
    Regex: OptionRestrictionRegex = null,
    UserDefined: js.UndefOr[Boolean] = js.undefined,
    ValueOptions: ConfigurationOptionPossibleValues = null,
    ValueType: ConfigurationOptionValueType = null
  ): ConfigurationOptionDescription = {
    val __obj = js.Dynamic.literal()
    if (ChangeSeverity != null) __obj.updateDynamic("ChangeSeverity")(ChangeSeverity.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (MaxLength != null) __obj.updateDynamic("MaxLength")(MaxLength.asInstanceOf[js.Any])
    if (MaxValue != null) __obj.updateDynamic("MaxValue")(MaxValue.asInstanceOf[js.Any])
    if (MinValue != null) __obj.updateDynamic("MinValue")(MinValue.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (Regex != null) __obj.updateDynamic("Regex")(Regex.asInstanceOf[js.Any])
    if (!js.isUndefined(UserDefined)) __obj.updateDynamic("UserDefined")(UserDefined.asInstanceOf[js.Any])
    if (ValueOptions != null) __obj.updateDynamic("ValueOptions")(ValueOptions.asInstanceOf[js.Any])
    if (ValueType != null) __obj.updateDynamic("ValueType")(ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOptionDescription]
  }
}

