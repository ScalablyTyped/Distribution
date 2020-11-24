package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserConfiguration extends js.Object {
  
  /**
    * Whether to throw on unknown options.
    * If false, then unknown args are included in the _args array.
    * Default: false
    */
  var allowUnknown: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to allow interspersed arguments (non-options) and options.
    *
    * E.g.:
    *   node tool.js arg1 arg2 -v
    *
    * '-v' is after some args here. If `interspersed: false` then '-v'
    *  would not be parsed out. Note that regardless of `interspersed`
    * the presence of '--' will stop option parsing, as all good
    * option parsers should.
    *
    * Default: true
    */
  var interspersed: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of option specs.
    */
  var options: js.Array[Option | Group] = js.native
}
object ParserConfiguration {
  
  @scala.inline
  def apply(options: js.Array[Option | Group]): ParserConfiguration = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserConfiguration]
  }
  
  @scala.inline
  implicit class ParserConfigurationOps[Self <: ParserConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown(value: Boolean): Self = this.set("allowUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnknown: Self = this.set("allowUnknown", js.undefined)
    
    @scala.inline
    def setInterspersed(value: Boolean): Self = this.set("interspersed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterspersed: Self = this.set("interspersed", js.undefined)
  }
}
