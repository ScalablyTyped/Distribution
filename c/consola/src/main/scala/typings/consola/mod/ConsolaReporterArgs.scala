package typings.consola.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsolaReporterArgs extends js.Object {
  
  var async: Boolean = js.native
  
  var stderr: WritableStream = js.native
  
  var stdout: WritableStream = js.native
}
object ConsolaReporterArgs {
  
  @scala.inline
  def apply(async: Boolean, stderr: WritableStream, stdout: WritableStream): ConsolaReporterArgs = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsolaReporterArgs]
  }
  
  @scala.inline
  implicit class ConsolaReporterArgsOps[Self <: ConsolaReporterArgs] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: WritableStream): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: WritableStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
}
