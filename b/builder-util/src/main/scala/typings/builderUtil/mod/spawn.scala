package typings.builderUtil.mod

import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "spawn")
@js.native
object spawn extends js.Object {
  def apply(command: String): js.Promise[_] = js.native
  def apply(command: String, args: js.Array[String]): js.Promise[_] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): js.Promise[_] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
  def apply(command: String, args: Null, options: SpawnOptions): js.Promise[_] = js.native
  def apply(command: String, args: Null, options: SpawnOptions, extraOptions: ExtraSpawnOptions): js.Promise[_] = js.native
}

