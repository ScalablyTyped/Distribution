package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetInfo extends js.Object {
  /** Queries basic CPU information of the system. */
  def getInfo(callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.cpuNs.CpuInfo, scala.Unit]): scala.Unit
}

object Anon_CallbackGetInfo {
  @scala.inline
  def apply(
    getInfo: js.Function1[
      js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.cpuNs.CpuInfo, scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackGetInfo = {
    val __obj = js.Dynamic.literal(getInfo = getInfo)
  
    __obj.asInstanceOf[Anon_CallbackGetInfo]
  }
}

