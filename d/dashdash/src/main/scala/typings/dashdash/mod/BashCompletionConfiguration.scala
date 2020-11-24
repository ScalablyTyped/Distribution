package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BashCompletionConfiguration extends js.Object {
  
  /**
    * Array of completion types for positional args (i.e. non-options).
    * If not given, positional args will use Bash's 'default' completion.
    */
  var argtypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The tool name.
    */
  var name: String = js.native
  
  /**
    * The array of dashdash option specs.
    */
  var options: js.UndefOr[js.Array[Option | Group]] = js.native
  
  /**
    * Extra Bash code content to add
    * to the end of the "spec". Typically this is used to append Bash
    * "complete_TYPE" functions for custom option types.
    */
  var specExtra: js.UndefOr[String] = js.native
}
object BashCompletionConfiguration {
  
  @scala.inline
  def apply(name: String): BashCompletionConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BashCompletionConfiguration]
  }
  
  @scala.inline
  implicit class BashCompletionConfigurationOps[Self <: BashCompletionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setArgtypesVarargs(value: String*): Self = this.set("argtypes", js.Array(value :_*))
    
    @scala.inline
    def setArgtypes(value: js.Array[String]): Self = this.set("argtypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgtypes: Self = this.set("argtypes", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (Option | Group)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option | Group]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSpecExtra(value: String): Self = this.set("specExtra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecExtra: Self = this.set("specExtra", js.undefined)
  }
}
