package typings.commander.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutableCommandOptions extends CommandOptions {
  
  var executableFile: js.UndefOr[String] = js.native
}
object ExecutableCommandOptions {
  
  @scala.inline
  def apply(): ExecutableCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutableCommandOptions]
  }
  
  @scala.inline
  implicit class ExecutableCommandOptionsOps[Self <: ExecutableCommandOptions] (val x: Self) extends AnyVal {
    
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
    def setExecutableFile(value: String): Self = this.set("executableFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableFile: Self = this.set("executableFile", js.undefined)
  }
}
