package typings.detectDashBrowser.detectDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "BrowserInfo")
@js.native
class BrowserInfo protected () extends DetectedInfo[Browser, OperatingSystem | Null, String] {
  def this(name: Browser, version: String) = this()
  def this(name: Browser, version: String, os: OperatingSystem) = this()
  /* CompleteClass */
  override val name: Browser = js.native
  /* CompleteClass */
  override val os: OperatingSystem | Null = js.native
  /* CompleteClass */
  override val version: String = js.native
}

