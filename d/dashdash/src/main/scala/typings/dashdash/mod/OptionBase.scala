package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionBase extends js.Object {
  
  /**
    * This is used for Bash completion for an option argument.
    * If not specified, then the value of type is used. Any string may be specified, but only the following values have meaning:
    *  - none: Provide no completions.
    *  - file: Bash's default completion (i.e. complete -o default), which includes filenames.
    *  - Any string FOO for which a function complete_FOO Bash function is defined.
    * This is for custom completions for a given tool.
    * Typically these custom functions are provided in the specExtra argument to dashdash.bashCompletionFromOptions().
    */
  var completionType: js.UndefOr[String] = js.native
  
  /**
    * A default value used for this option, if the option isn't specified in argv.
    */
  var default: js.UndefOr[String] = js.native
  
  /**
    * An environment variable name (or names) that can be used as a fallback for this option.
    * An environment variable is only used as a fallback, i.e. it is ignored if the associated option is given in `argv`.
    */
  var env: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Used for parser.help() output.
    */
  var help: js.UndefOr[String] = js.native
  
  /**
    * Used in help output as the placeholder for the option argument.
    */
  var helpArg: js.UndefOr[String] = js.native
  
  /**
    * Set this to false to have that option's help not be text wrapped in <parser>.help() output.
    */
  var helpWrap: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, help output will not include this option.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * One of: bool, string, number, integer, positiveInteger, arrayOfBool, arrayOfString,
    * arrayOfNumber, arrayOfInteger, arrayOfPositiveInteger, arrayOfDate,
    * date (epoch seconds, e.g. 1396031701, or ISO 8601 format YYYY-MM-DD[THH:MM:SS[.sss][Z]], e.g. "2014-03-28T18:35:01.489Z").
    * You can add your own custom option types with `dashdash.addOptionType`
    * These names attempt to match with asserts on `assert-plus`.
    */
  var `type`: String = js.native
}
object OptionBase {
  
  @scala.inline
  def apply(`type`: String): OptionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionBase]
  }
  
  @scala.inline
  implicit class OptionBaseOps[Self <: OptionBase] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionType(value: String): Self = this.set("completionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionType: Self = this.set("completionType", js.undefined)
    
    @scala.inline
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setEnvVarargs(value: String*): Self = this.set("env", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: String | js.Array[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setHelpArg(value: String): Self = this.set("helpArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpArg: Self = this.set("helpArg", js.undefined)
    
    @scala.inline
    def setHelpWrap(value: Boolean): Self = this.set("helpWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpWrap: Self = this.set("helpWrap", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
  }
}
