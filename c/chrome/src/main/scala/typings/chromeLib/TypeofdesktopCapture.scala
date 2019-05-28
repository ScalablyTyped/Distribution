package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdesktopCapture extends js.Object {
  def cancelChooseDesktopMedia(desktopMediaRequestId: scala.Double): scala.Unit = js.native
  def chooseDesktopMedia(
    sources: js.Array[java.lang.String],
    callback: js.Function1[/* streamId */ java.lang.String, scala.Unit]
  ): scala.Double = js.native
  def chooseDesktopMedia(
    sources: js.Array[java.lang.String],
    targetTab: chromeLib.chromeNs.tabsNs.Tab,
    callback: js.Function1[/* streamId */ java.lang.String, scala.Unit]
  ): scala.Double = js.native
}

