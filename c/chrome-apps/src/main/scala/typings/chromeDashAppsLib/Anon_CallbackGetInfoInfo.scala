package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetInfoInfo extends js.Object {
  /** Get physical memory information. */
  def getInfo(
    callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit]
  ): scala.Unit
}

