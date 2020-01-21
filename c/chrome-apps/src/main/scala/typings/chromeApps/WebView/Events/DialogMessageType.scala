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
  def alert: typings.chromeApps.chromeAppsStrings.alert = this.cast("alert")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typings.chromeApps.chromeAppsStrings.confirm = this.cast("confirm")
  @scala.inline
  def prompt: typings.chromeApps.chromeAppsStrings.prompt = this.cast("prompt")
}

