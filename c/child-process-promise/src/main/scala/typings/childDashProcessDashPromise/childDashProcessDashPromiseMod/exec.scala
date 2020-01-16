package typings.childDashProcessDashPromise.childDashProcessDashPromiseMod

import typings.childDashProcessDashPromise.Anon_Buffer
import typings.childDashProcessDashPromise.Anon_Encoding
import typings.childDashProcessDashPromise.Anon_EncodingString
import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "exec")
@js.native
object exec extends js.Object {
  def apply(command: String): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(
    command: String,
    options: Options with Anon_Buffer with ExecOptions with Anon_Encoding with Anon_EncodingString
  ): ChildProcessPromise[PromiseResult[Buffer]] = js.native
}

