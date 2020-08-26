package typings.detectBrowser.mod

import typings.detectBrowser.detectBrowserStrings.browser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("detect-browser", "BrowserInfo")
@js.native
class BrowserInfo protected () extends DetectedInfo[browser, Browser, OperatingSystem | Null, String] {
  def this(name: Browser, version: String) = this()
  def this(name: Browser, version: String, os: OperatingSystem) = this()
  @JSName("type")
  val type_BrowserInfo: /* "browser" */ String = js.native
}

