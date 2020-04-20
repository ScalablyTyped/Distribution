package typings.chromeApps.WebView.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The type of modal dialog requested by the guest.
  */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.alert
  - typings.chromeApps.chromeAppsStrings.confirm
  - typings.chromeApps.chromeAppsStrings.prompt
*/
trait DialogMessageType extends js.Object

object DialogMessageType {
  @scala.inline
  def alert: typings.chromeApps.chromeAppsStrings.alert = "alert".asInstanceOf[typings.chromeApps.chromeAppsStrings.alert]
  @scala.inline
  def confirm: typings.chromeApps.chromeAppsStrings.confirm = "confirm".asInstanceOf[typings.chromeApps.chromeAppsStrings.confirm]
  @scala.inline
  def prompt: typings.chromeApps.chromeAppsStrings.prompt = "prompt".asInstanceOf[typings.chromeApps.chromeAppsStrings.prompt]
}

