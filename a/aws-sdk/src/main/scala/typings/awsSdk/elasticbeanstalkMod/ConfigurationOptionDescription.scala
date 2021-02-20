package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOptionDescription extends StObject {
  
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
  def apply(): ConfigurationOptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionDescription]
  }
  
  @scala.inline
  implicit class ConfigurationOptionDescriptionMutableBuilder[Self <: ConfigurationOptionDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeSeverity(value: ConfigurationOptionSeverity): Self = StObject.set(x, "ChangeSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeSeverityUndefined: Self = StObject.set(x, "ChangeSeverity", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: ConfigurationOptionDefaultValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    @scala.inline
    def setMaxLength(value: OptionRestrictionMaxLength): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "MaxLength", js.undefined)
    
    @scala.inline
    def setMaxValue(value: OptionRestrictionMaxValue): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "MaxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: OptionRestrictionMinValue): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "MinValue", js.undefined)
    
    @scala.inline
    def setName(value: ConfigurationOptionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNamespace(value: OptionNamespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    @scala.inline
    def setRegex(value: OptionRestrictionRegex): Self = StObject.set(x, "Regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "Regex", js.undefined)
    
    @scala.inline
    def setUserDefined(value: UserDefinedOption): Self = StObject.set(x, "UserDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedUndefined: Self = StObject.set(x, "UserDefined", js.undefined)
    
    @scala.inline
    def setValueOptions(value: ConfigurationOptionPossibleValues): Self = StObject.set(x, "ValueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOptionsUndefined: Self = StObject.set(x, "ValueOptions", js.undefined)
    
    @scala.inline
    def setValueOptionsVarargs(value: ConfigurationOptionPossibleValue*): Self = StObject.set(x, "ValueOptions", js.Array(value :_*))
    
    @scala.inline
    def setValueType(value: ConfigurationOptionValueType): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueTypeUndefined: Self = StObject.set(x, "ValueType", js.undefined)
  }
}
