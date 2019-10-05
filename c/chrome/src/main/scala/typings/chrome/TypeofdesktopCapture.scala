package typings.chrome

import typings.chrome.chrome.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdesktopCapture extends js.Object {
  def cancelChooseDesktopMedia(desktopMediaRequestId: Double): Unit = js.native
  def chooseDesktopMedia(sources: js.Array[String], callback: js.Function1[/* streamId */ String, Unit]): Double = js.native
  def chooseDesktopMedia(sources: js.Array[String], targetTab: Tab, callback: js.Function1[/* streamId */ String, Unit]): Double = js.native
}

