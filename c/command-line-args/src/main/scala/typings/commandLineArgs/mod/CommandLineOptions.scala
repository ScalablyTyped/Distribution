package typings.commandLineArgs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandLineOptions
  extends /* propName */ StringDictionary[js.Any] {
  
  /**
    * Command-line arguments not parsed by `commandLineArgs`.
    */
  var _unknown: js.UndefOr[js.Array[String]] = js.native
}
object CommandLineOptions {
  
  @scala.inline
  def apply(): CommandLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandLineOptions]
  }
  
  @scala.inline
  implicit class CommandLineOptionsOps[Self <: CommandLineOptions] (val x: Self) extends AnyVal {
    
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
    def set_unknownVarargs(value: String*): Self = this.set("_unknown", js.Array(value :_*))
    
    @scala.inline
    def set_unknown(value: js.Array[String]): Self = this.set("_unknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_unknown: Self = this.set("_unknown", js.undefined)
  }
}
