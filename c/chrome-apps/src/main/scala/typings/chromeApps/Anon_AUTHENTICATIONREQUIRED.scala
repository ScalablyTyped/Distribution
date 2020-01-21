package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.authentication_required
import typings.chromeApps.chromeAppsStrings.disabled_
import typings.chromeApps.chromeAppsStrings.initializing
import typings.chromeApps.chromeAppsStrings.running
import typings.chromeApps.chromeAppsStrings.temporary_unavailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUTHENTICATIONREQUIRED extends js.Object {
  var AUTHENTICATION_REQUIRED: authentication_required
  var DISABLED: disabled_
  var INITIALIZING: initializing
  var RUNNING: running
  var TEMPORARY_UNAVAILABLE: temporary_unavailable
}

object Anon_AUTHENTICATIONREQUIRED {
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: authentication_required,
    DISABLED: disabled_,
    INITIALIZING: initializing,
    RUNNING: running,
    TEMPORARY_UNAVAILABLE: temporary_unavailable
  ): Anon_AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INITIALIZING = INITIALIZING.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AUTHENTICATIONREQUIRED]
  }
}

