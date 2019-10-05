package typings.chromeDashApps.chrome.system.powerSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.powerSource.getPowerSourceInfo")
@js.native
object getPowerSourceInfo extends js.Object {
  /**
    * Requests information on attached power sources.
    * @param callback The callback to invoke with the results or undefined if the power source information is not known.
    */
  def apply(callback: js.Function1[/* powerSourceInfo */ js.UndefOr[js.Array[PowerSourceInfo]], Unit]): Unit = js.native
}

