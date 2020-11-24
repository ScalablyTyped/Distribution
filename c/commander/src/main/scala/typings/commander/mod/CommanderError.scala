package typings.commander.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommanderError extends Error {
  
  var code: String = js.native
  
  var exitCode: Double = js.native
  
  var nestedError: js.UndefOr[String] = js.native
}
object CommanderError {
  
  @scala.inline
  def apply(code: String, exitCode: Double, message: String, name: String): CommanderError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommanderError]
  }
  
  @scala.inline
  implicit class CommanderErrorOps[Self <: CommanderError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedError(value: String): Self = this.set("nestedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedError: Self = this.set("nestedError", js.undefined)
  }
}
