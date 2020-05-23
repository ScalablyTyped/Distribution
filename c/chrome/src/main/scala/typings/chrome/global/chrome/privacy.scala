package typings.chrome.global.chrome

import typings.chrome.chrome.privacy.Network
import typings.chrome.chrome.privacy.Services
import typings.chrome.chrome.privacy.Websites
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Privacy
////////////////////
/**
  * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
  * Permissions:  "privacy"
  * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
  * @since Chrome 18.
  */
@JSGlobal("chrome.privacy")
@js.native
object privacy extends js.Object {
  var network: Network = js.native
  var services: Services = js.native
  var websites: Websites = js.native
}

