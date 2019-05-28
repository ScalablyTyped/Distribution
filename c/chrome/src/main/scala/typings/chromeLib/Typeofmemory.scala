package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmemory extends js.Object {
  def getInfo(callback: js.Function1[/* info */ chromeLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit]): scala.Unit
}

object Typeofmemory {
  @scala.inline
  def apply(
    getInfo: js.Function1[/* info */ chromeLib.chromeNs.systemNs.memoryNs.MemoryInfo, scala.Unit] => scala.Unit
  ): Typeofmemory = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
  
    __obj.asInstanceOf[Typeofmemory]
  }
}

