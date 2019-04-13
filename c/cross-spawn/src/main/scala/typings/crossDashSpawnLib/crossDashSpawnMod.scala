package typings
package crossDashSpawnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-spawn", JSImport.Namespace)
@js.native
object crossDashSpawnMod extends js.Object {
  def apply(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  @js.native
  object sync extends js.Object {
    def apply(command: java.lang.String): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
    def apply(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
    def apply(
      command: java.lang.String,
      args: js.Array[java.lang.String],
      options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions
    ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
    def apply(
      command: java.lang.String,
      args: js.Array[java.lang.String],
      options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
    ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
    def apply(
      command: java.lang.String,
      args: js.Array[java.lang.String],
      options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
    ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
    def apply(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
    def apply(
      command: java.lang.String,
      options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
    ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
    def apply(
      command: java.lang.String,
      options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
    ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  }
  
}

