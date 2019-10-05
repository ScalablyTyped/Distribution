package typings.chromeDashApps.chrome.system.memory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.memory.getInfo")
@js.native
object getInfo extends js.Object {
  /** Get physical memory information. */
  def apply(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
}

