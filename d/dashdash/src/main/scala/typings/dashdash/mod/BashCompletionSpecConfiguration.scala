package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BashCompletionSpecConfiguration extends js.Object {
  
  /**
    * Array of completion types for positional args (i.e. non-options).
    * If not given, positional args will use Bash's 'default' completion.
    */
  var argtypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A context string for the "local cmd*"
    * vars in the spec. By default it is the empty string. When used to
    * scope for completion on a *sub-command*.
    */
  var context: js.UndefOr[String] = js.native
  
  /**
    * By default
    * hidden options and subcmds are "excluded". Here excluded means they
    * won't be offered as a completion, but if used, their argument type
    * will be completed. "Hidden" options and subcmds are ones with the
    * `hidden: true` attribute to exclude them from default help output.
    */
  var includeHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * The array of dashdash option specs.
    */
  var options: js.Array[Option | Group] = js.native
}
object BashCompletionSpecConfiguration {
  
  @scala.inline
  def apply(options: js.Array[Option | Group]): BashCompletionSpecConfiguration = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[BashCompletionSpecConfiguration]
  }
  
  @scala.inline
  implicit class BashCompletionSpecConfigurationOps[Self <: BashCompletionSpecConfiguration] (val x: Self) extends AnyVal {
    
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
    def setOptionsVarargs(value: (Option | Group)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option | Group]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgtypesVarargs(value: String*): Self = this.set("argtypes", js.Array(value :_*))
    
    @scala.inline
    def setArgtypes(value: js.Array[String]): Self = this.set("argtypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgtypes: Self = this.set("argtypes", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIncludeHidden(value: Boolean): Self = this.set("includeHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeHidden: Self = this.set("includeHidden", js.undefined)
  }
}
