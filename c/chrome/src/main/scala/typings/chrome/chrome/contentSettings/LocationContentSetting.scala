package typings.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationContentSetting extends ContentSetting {
  
  def set(details: LocationSetDetails): Unit = js.native
  def set(details: LocationSetDetails, callback: js.Function0[Unit]): Unit = js.native
}
