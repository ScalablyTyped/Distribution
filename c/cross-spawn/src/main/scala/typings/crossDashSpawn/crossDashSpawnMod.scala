package typings.crossDashSpawn

import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.node.childUnderscoreProcessMod.SpawnSyncOptions
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-spawn", JSImport.Namespace)
@js.native
object crossDashSpawnMod extends js.Object {
  def apply(command: String): ChildProcess = js.native
  def apply(command: String, args: js.Array[String]): ChildProcess = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  @js.native
  object sync extends js.Object {
    def apply(command: String): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
    def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
    def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  }
  
}

