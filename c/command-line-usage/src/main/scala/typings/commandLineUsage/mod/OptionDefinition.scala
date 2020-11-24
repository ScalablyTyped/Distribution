package typings.commandLineUsage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a command-line option. Additionally, if generating a usage guide with command-line-usage you could optionally add description and typeLabel properties to each definition. */
@js.native
trait OptionDefinition extends js.Object {
  
  /** getopt-style short option names. Can be any single character (unicode included) except a digit or hyphen. */
  var alias: js.UndefOr[String] = js.native
  
  /** Any values unaccounted for by an option definition will be set on the defaultOption. This flag is typically set on the most commonly-used option to make for more concise usage. */
  var defaultOption: js.UndefOr[Boolean] = js.native
  
  /** An initial value for the option. */
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  /** A string describing the option. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * When your app has a large amount of options it makes sense to organise them in groups.
    *
    * There are two automatic groups: _all (contains all options) and _none (contains options without a group specified in their definition).
    */
  var group: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Identical to multiple but with greedy parsing disabled. */
  var lazyMultiple: js.UndefOr[Boolean] = js.native
  
  /** Set this flag if the option takes a list of values. You will receive an array of values, each passed through the type function (if specified). */
  var multiple: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  /**
    * The type value is a setter function (you receive the output from this), enabling you to be specific about the type and value received.
    *
    * The most common values used are String (the default), Number and Boolean but you can use a custom function.
    */
  var `type`: js.UndefOr[js.Any] = js.native
  
  /** A string to replace the default type string (e.g. <string>). It's often more useful to set a more descriptive type label, like <ms>, <files>, <command>, etc.. */
  var typeLabel: js.UndefOr[String] = js.native
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
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
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setTypeLabel(value: String): Self = this.set("typeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeLabel: Self = this.set("typeLabel", js.undefined)
  }
}
