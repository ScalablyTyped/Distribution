package typings.childProcessPromise.mod

import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseResult[Enc /* <: String | Buffer */] extends js.Object {
  var childProcess: ChildProcess
  var stderr: Enc
  var stdout: Enc
}

object PromiseResult {
  @scala.inline
  def apply[/* <: java.lang.String | typings.node.Buffer */ Enc](childProcess: ChildProcess, stderr: Enc, stdout: Enc): PromiseResult[Enc] = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseResult[Enc]]
  }
}

