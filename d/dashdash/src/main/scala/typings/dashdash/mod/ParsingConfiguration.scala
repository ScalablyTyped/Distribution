package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsingConfiguration extends js.Object {
  
  /**
    * The argv to parse. Defaults to `process.argv`.
    */
  var argv: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The env to use for 'env' entries in the option specs. Defaults to `process.env`.
    */
  var env: js.UndefOr[js.Any] = js.native
  
   // NodeJS.ProcessEnv;
  var options: js.UndefOr[js.Array[Option | Group]] = js.native
  
  /**
    * The index into argv at which options/args begin.  Default is 2, as appropriate for `process.argv`.
    */
  var slice: js.UndefOr[Double] = js.native
}
object ParsingConfiguration {
  
  @scala.inline
  def apply(): ParsingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingConfiguration]
  }
  
  @scala.inline
  implicit class ParsingConfigurationOps[Self <: ParsingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgv: Self = this.set("argv", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: (Option | Group)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[Option | Group]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSlice(value: Double): Self = this.set("slice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
  }
}
