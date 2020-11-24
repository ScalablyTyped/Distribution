package typings.cac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  var config: OptionConfig = js.native
  
  var description: String = js.native
  
  var isBoolean: js.UndefOr[Boolean] = js.native
  
  /** Option name */
  var name: String = js.native
  
  /** Option name and aliases */
  var names: js.Array[String] = js.native
  
  var negated: Boolean = js.native
  
  var rawName: String = js.native
  
  var required: js.UndefOr[Boolean] = js.native
}
object Option {
  
  @scala.inline
  def apply(
    config: OptionConfig,
    description: String,
    name: String,
    names: js.Array[String],
    negated: Boolean,
    rawName: String
  ): Option = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: OptionConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegated(value: Boolean): Self = this.set("negated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawName(value: String): Self = this.set("rawName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBoolean(value: Boolean): Self = this.set("isBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBoolean: Self = this.set("isBoolean", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
}
