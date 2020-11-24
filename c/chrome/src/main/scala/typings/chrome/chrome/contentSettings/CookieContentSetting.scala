package typings.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieContentSetting extends ContentSetting {
  
  def set(details: CookieSetDetails): Unit = js.native
  def set(details: CookieSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
