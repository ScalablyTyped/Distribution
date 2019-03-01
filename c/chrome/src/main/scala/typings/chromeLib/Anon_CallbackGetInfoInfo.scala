package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackGetInfoInfo extends js.Object {
  def getInfo(callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit]): scala.Unit
}

object Anon_CallbackGetInfoInfo {
  @scala.inline
  def apply(
    getInfo: js.Function1[
      js.Function1[/* info */ chromeLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackGetInfoInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(getInfo)
    __obj.asInstanceOf[Anon_CallbackGetInfoInfo]
  }
}

