package typings.childDashProcessDashPromise.childDashProcessDashPromiseMod

import typings.node.childUnderscoreProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child-process-promise", "spawn")
@js.native
object spawn extends js.Object {
  def apply(command: String): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.Array[String]): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: js.Array[String], options: Options with SpawnOptions): ChildProcessPromise[SpawnPromiseResult] = js.native
  def apply(command: String, args: Null, options: Options with SpawnOptions): ChildProcessPromise[SpawnPromiseResult] = js.native
}

