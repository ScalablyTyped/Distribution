package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`false`
import typings.chromeApps.chromeAppsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AutomationOptions extends js.Object

object _AutomationOptions {
  @scala.inline
  def AutomationDesktop(desktop: `true`, interact: `true` = null): _AutomationOptions = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any])
    if (interact != null) __obj.updateDynamic("interact")(interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutomationOptions]
  }
  @scala.inline
  def AutomationNonInteractive(interact: `false`, desktop: `false` = null, matches: js.Array[String | UrlMatches] = null): _AutomationOptions = {
    val __obj = js.Dynamic.literal(interact = interact.asInstanceOf[js.Any])
    if (desktop != null) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    __obj.asInstanceOf[_AutomationOptions]
  }
}

