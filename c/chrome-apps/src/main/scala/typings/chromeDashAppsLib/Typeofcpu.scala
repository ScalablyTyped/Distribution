package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcpu extends js.Object {
  /** Queries basic CPU information of the system. */
  def getInfo(callback: js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.cpuNs.CpuInfo, scala.Unit]): scala.Unit
}

object Typeofcpu {
  @scala.inline
  def apply(
    getInfo: js.Function1[/* info */ chromeDashAppsLib.chromeNs.systemNs.cpuNs.CpuInfo, scala.Unit] => scala.Unit
  ): Typeofcpu = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
  
    __obj.asInstanceOf[Typeofcpu]
  }
}

