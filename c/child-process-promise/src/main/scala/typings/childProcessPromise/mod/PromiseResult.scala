package typings.childProcessPromise.mod

import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseResult[Enc /* <: String | Buffer */] extends js.Object {
  
  var childProcess: ChildProcess = js.native
  
  var stderr: Enc = js.native
  
  var stdout: Enc = js.native
}
object PromiseResult {
  
  @scala.inline
  def apply[Enc /* <: String | Buffer */](childProcess: ChildProcess, stderr: Enc, stdout: Enc): PromiseResult[Enc] = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[Enc]]
  }
  
  @scala.inline
  implicit class PromiseResultOps[Self <: PromiseResult[_], Enc /* <: String | Buffer */] (val x: Self with PromiseResult[Enc]) extends AnyVal {
    
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
    def setChildProcess(value: ChildProcess): Self = this.set("childProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderr(value: Enc): Self = this.set("stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdout(value: Enc): Self = this.set("stdout", value.asInstanceOf[js.Any])
  }
}
