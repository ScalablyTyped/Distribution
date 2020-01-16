package typings.childDashProcessDashPromise.childDashProcessDashPromiseMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnPromiseResult extends PromiseResult[String] {
  var code: Double
}

object SpawnPromiseResult {
  @scala.inline
  def apply(childProcess: ChildProcess, code: Double, stderr: String, stdout: String): SpawnPromiseResult = {
    val __obj = js.Dynamic.literal(childProcess = childProcess.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpawnPromiseResult]
  }
}

