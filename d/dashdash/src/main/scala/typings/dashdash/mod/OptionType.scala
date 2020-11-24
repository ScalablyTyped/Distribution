package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionType extends js.Object {
  
  /**
    * Set to true if this is an 'arrayOf' type
    * that collects multiple usages of the option in process.argv and puts results in an array.
    */
  var array: js.UndefOr[Boolean] = js.native
  
  var arrayFlatten: js.UndefOr[Boolean] = js.native
  
  var completionType: js.UndefOr[js.Any] = js.native
  
  /**
    * Default value for options of this type, if no default is specified in the option type usage.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Required iff `takesArg === true`. The string to show in generated help for options of this type.
    */
  var helpArg: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  /**
    * parser that takes a string argument and returns an instance of the
    * appropriate type, or throws an error if the arg is invalid.
    */
  def parseArg(option: Option, optstr: String, arg: String): js.Any = js.native
  
  /**
    * Whether this type of option takes an
    * argument on process.argv. Typically this is true for all but the
    * "bool" type.
    */
  var takesArg: Boolean = js.native
}
object OptionType {
  
  @scala.inline
  def apply(name: String, parseArg: (Option, String, String) => js.Any, takesArg: Boolean): OptionType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parseArg = js.Any.fromFunction3(parseArg), takesArg = takesArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionType]
  }
  
  @scala.inline
  implicit class OptionTypeOps[Self <: OptionType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseArg(value: (Option, String, String) => js.Any): Self = this.set("parseArg", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTakesArg(value: Boolean): Self = this.set("takesArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setArrayFlatten(value: Boolean): Self = this.set("arrayFlatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFlatten: Self = this.set("arrayFlatten", js.undefined)
    
    @scala.inline
    def setCompletionType(value: js.Any): Self = this.set("completionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionType: Self = this.set("completionType", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setHelpArg(value: String): Self = this.set("helpArg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelpArg: Self = this.set("helpArg", js.undefined)
  }
}
