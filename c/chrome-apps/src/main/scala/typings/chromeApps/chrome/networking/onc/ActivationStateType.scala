package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.Activated
  - typings.chromeApps.chromeAppsStrings.Activating
  - typings.chromeApps.chromeAppsStrings.NotActivated
  - typings.chromeApps.chromeAppsStrings.PartiallyActivated
*/
trait ActivationStateType extends js.Object

object ActivationStateType {
  @scala.inline
  def Activated: typings.chromeApps.chromeAppsStrings.Activated = this.cast("Activated")
  @scala.inline
  def Activating: typings.chromeApps.chromeAppsStrings.Activating = this.cast("Activating")
  @scala.inline
  def NotActivated: typings.chromeApps.chromeAppsStrings.NotActivated = this.cast("NotActivated")
  @scala.inline
  def PartiallyActivated: typings.chromeApps.chromeAppsStrings.PartiallyActivated = this.cast("PartiallyActivated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

