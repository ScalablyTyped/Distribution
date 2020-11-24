package typings.commandLineArgs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionDefinition extends js.Object {
  
  /**
    * A getopt-style short option name. Can be any single character except a digit or hyphen.
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * Any values unaccounted for by an option definition will be set on the `defaultOption`. This flag is typically set
    * on the most commonly-used option to enable more concise usage.
    */
  var defaultOption: js.UndefOr[Boolean] = js.native
  
  /**
    * An initial value for the option.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /**
    * One or more group names the option belongs to.
    */
  var group: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Identical to `multiple` but with greedy parsing disabled.
    */
  var lazyMultiple: js.UndefOr[Boolean] = js.native
  
  /**
    * Set this flag if the option accepts multiple values. In the output, you will receive an array of values each passed through the `type` function.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  
  /**
    * The long option name.
    */
  var name: String = js.native
  
  /**
    * A setter function (you receive the output from this) enabling you to be specific about the type and value received. Typical values
    * are `String` (the default), `Number` and `Boolean` but you can use a custom function. If no option value was set you will receive `null`.
    */
  var `type`: js.UndefOr[js.Function1[/* input */ String, _]] = js.native
}
object OptionDefinition {
  
  @scala.inline
  def apply(name: String): OptionDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDefinition]
  }
  
  @scala.inline
  implicit class OptionDefinitionOps[Self <: OptionDefinition] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setDefaultOption(value: Boolean): Self = this.set("defaultOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOption: Self = this.set("defaultOption", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: String*): Self = this.set("group", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: String | js.Array[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setLazyMultiple(value: Boolean): Self = this.set("lazyMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLazyMultiple: Self = this.set("lazyMultiple", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setType(value: /* input */ String => _): Self = this.set("type", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
