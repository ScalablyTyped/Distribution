package typings.childProcessPromise.mod

import typings.node.Buffer
import typings.node.childProcessMod.ExecFileOptionsWithBufferEncoding
import typings.node.childProcessMod.ExecFileOptionsWithOtherEncoding
import typings.node.childProcessMod.ExecFileOptionsWithStringEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "execFile")
@js.native
object execFile extends js.Object {
  def apply(file: String): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(file: String, args: js.Array[String]): ChildProcessPromise[PromiseResult[String]] = js.native
  def apply(
    file: String,
    args: js.Array[String],
    options: Options with ExecFileOptionsWithBufferEncoding with ExecFileOptionsWithOtherEncoding with ExecFileOptionsWithStringEncoding
  ): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(
    file: String,
    args: Null,
    options: Options with ExecFileOptionsWithBufferEncoding with ExecFileOptionsWithOtherEncoding with ExecFileOptionsWithStringEncoding
  ): ChildProcessPromise[PromiseResult[Buffer]] = js.native
  def apply(
    file: String,
    options: Options with ExecFileOptionsWithBufferEncoding with ExecFileOptionsWithStringEncoding with ExecFileOptionsWithOtherEncoding
  ): ChildProcessPromise[PromiseResult[Buffer]] = js.native
}

