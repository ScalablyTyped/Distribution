package typings.chrome.global.chrome

import typings.chrome.chrome.privacy.Network
import typings.chrome.chrome.privacy.Services
import typings.chrome.chrome.privacy.Websites
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Privacy
////////////////////
/**
  * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
  * Permissions:  "privacy"
  * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
  * @since Chrome 18.
  */
object privacy {
  
  @JSGlobal("chrome.privacy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.privacy.network")
  @js.native
  def network: Network = js.native
  @scala.inline
  def network_=(x: Network): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("network")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.privacy.services")
  @js.native
  def services: Services = js.native
  @scala.inline
  def services_=(x: Services): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("services")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.privacy.websites")
  @js.native
  def websites: Websites = js.native
  @scala.inline
  def websites_=(x: Websites): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websites")(x.asInstanceOf[js.Any])
}
