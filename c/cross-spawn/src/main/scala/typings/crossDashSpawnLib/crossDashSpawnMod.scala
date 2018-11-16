package typings
package crossDashSpawnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cross-spawn", JSImport.Namespace)
@js.native
object crossDashSpawnMod extends js.Object {
  val sync: js.Function3[
    /* command */ java.lang.String, 
    /* args */ js.Array[java.lang.String], 
    /* options */ nodeLib.childUnderscoreProcessMod.SpawnSyncOptions, 
    nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer]
  ] = js.native
  def apply(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
}

