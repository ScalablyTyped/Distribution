package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ConfigurationOptionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationOptionDescription]
  }
  
  @scala.inline
  implicit class ConfigurationOptionDescriptionOps[Self <: ConfigurationOptionDescription] (val x: Self) extends AnyVal {
    
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
    def setChangeSeverity(value: ConfigurationOptionSeverity): Self = this.set("ChangeSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeSeverity: Self = this.set("ChangeSeverity", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: ConfigurationOptionDefaultValue): Self = this.set("DefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("DefaultValue", js.undefined)
    
    @scala.inline
    def setMaxLength(value: OptionRestrictionMaxLength): Self = this.set("MaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("MaxLength", js.undefined)
    
    @scala.inline
    def setMaxValue(value: OptionRestrictionMaxValue): Self = this.set("MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("MaxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: OptionRestrictionMinValue): Self = this.set("MinValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("MinValue", js.undefined)
    
    @scala.inline
    def setName(value: ConfigurationOptionName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNamespace(value: OptionNamespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("Namespace", js.undefined)
    
    @scala.inline
    def setRegex(value: OptionRestrictionRegex): Self = this.set("Regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("Regex", js.undefined)
    
    @scala.inline
    def setUserDefined(value: UserDefinedOption): Self = this.set("UserDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefined: Self = this.set("UserDefined", js.undefined)
    
    @scala.inline
    def setValueOptionsVarargs(value: ConfigurationOptionPossibleValue*): Self = this.set("ValueOptions", js.Array(value :_*))
    
    @scala.inline
    def setValueOptions(value: ConfigurationOptionPossibleValues): Self = this.set("ValueOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueOptions: Self = this.set("ValueOptions", js.undefined)
    
    @scala.inline
    def setValueType(value: ConfigurationOptionValueType): Self = this.set("ValueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueType: Self = this.set("ValueType", js.undefined)
  }
}
