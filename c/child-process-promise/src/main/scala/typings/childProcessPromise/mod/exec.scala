package typings.childProcessPromise.mod

import typings.childProcessPromise.AnonBuffer
import typings.childProcessPromise.AnonEncoding
import typings.childProcessPromise.AnonEncodingString
import typings.node.Buffer
import typings.node.childProcessMod.ExecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "exec")
@js.native
object exec extends js.Object {
  def apply(command: String): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(
    command: String,
    options: Options with AnonBuffer with ExecOptions with AnonEncoding with AnonEncodingString
  ): ChildProcessPromise[PromiseResult[Buffer]] = js.native
}

