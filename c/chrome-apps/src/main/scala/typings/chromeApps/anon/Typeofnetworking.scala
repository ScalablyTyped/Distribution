package typings.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofnetworking extends js.Object {
  
  // #endregion
  // #region chrome.networking.*
  ///////////////////////
  // NETWORKING CONFIG //
  ///////////////////////
  /**
    * @requires(CrOS) Chrome OS only.
    * @requires Permissions: 'networking.config'
    * @description
    * Use the *networking.config* API to authenticate to captive portals.
    */
  val config: Typeofconfig = js.native
  
  //////////////////////////////////////
  // Open Network Configuration (ONC) //
  //////////////////////////////////////
  /**
    * @requires(CrOS kiosk mode) This API is available in Chrome OS kiosk sessions.
    * @requires Permissions: 'networking.onc'
    * @since Chrome 59
    * @description
    * The chrome.networking.onc API is used for configuring network connections
    * (Cellular, Ethernet, VPN, WiFi or WiMAX).
    * Network connection configurations are specified following
    * @see[Open Network Configuration (ONC) specification.]{@link https://chromium.googlesource.com/chromium/src/+/master/components/onc/docs/onc_spec.md}
    * @description
    * **NOTE**
    * Most interface properties and type values use UpperCamelCase to match
    * the ONC specification instead of the JavaScript lowerCamelCase convention.
    */
  val onc: Typeofonc = js.native
}
object Typeofnetworking {
  
  @scala.inline
  def apply(config: Typeofconfig, onc: Typeofonc): Typeofnetworking = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onc = onc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetworking]
  }
  
  @scala.inline
  implicit class TypeofnetworkingOps[Self <: Typeofnetworking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConfig(value: Typeofconfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnc(value: Typeofonc): Self = this.set("onc", value.asInstanceOf[js.Any])
  }
}
