package typings.detectBrowser.mod

import typings.detectBrowser.detectBrowserStrings.`bot-device`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("detect-browser", "SearchBotDeviceInfo")
@js.native
class SearchBotDeviceInfo protected () extends DetectedInfo[`bot-device`, Browser, OperatingSystem | Null, String] {
  def this(name: Browser, version: String, os: Null, bot: String) = this()
  def this(name: Browser, version: String, os: OperatingSystem, bot: String) = this()
  
  val bot: String = js.native
  
  @JSName("type")
  val type_SearchBotDeviceInfo: /* "bot-device" */ String = js.native
}
