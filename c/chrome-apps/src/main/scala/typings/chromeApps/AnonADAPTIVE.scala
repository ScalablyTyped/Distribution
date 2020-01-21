package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.adaptive
import typings.chromeApps.chromeAppsStrings.asynchronous
import typings.chromeApps.chromeAppsStrings.synchronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonADAPTIVE extends js.Object {
  var ADAPTIVE: adaptive
  var ASYNCHRONOUS: asynchronous
  var SYNCHRONOUS: synchronous
}

object AnonADAPTIVE {
  @scala.inline
  def apply(ADAPTIVE: adaptive, ASYNCHRONOUS: asynchronous, SYNCHRONOUS: synchronous): AnonADAPTIVE = {
    val __obj = js.Dynamic.literal(ADAPTIVE = ADAPTIVE.asInstanceOf[js.Any], ASYNCHRONOUS = ASYNCHRONOUS.asInstanceOf[js.Any], SYNCHRONOUS = SYNCHRONOUS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonADAPTIVE]
  }
}

