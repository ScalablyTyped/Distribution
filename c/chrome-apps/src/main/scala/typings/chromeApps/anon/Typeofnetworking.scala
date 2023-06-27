package typings.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofnetworking extends StObject {
  
  // #endregion
  // #region chrome.networking.*
  ///////////////////////
  // NETWORKING CONFIG //
  ///////////////////////
  /**
    * @requires Chrome OS only.
    * @requires Permissions: 'networking.config'
    * @description
    * Use the *networking.config* API to authenticate to captive portals.
    */
  val config: Typeofconfig
  
  //////////////////////////////////////
  // Open Network Configuration (ONC) //
  //////////////////////////////////////
  /**
    * @requires CrOS kiosk mode -This API is available in Chrome OS kiosk sessions.
    * @requires Permissions: 'networking.onc'
    * @since Chrome 59
    * @description
    * The chrome.networking.onc API is used for configuring network connections
    * (Cellular, Ethernet, VPN, WiFi or WiMAX).
    * Network connection configurations are specified following
    * @see https://chromium.googlesource.com/chromium/src/+/master/components/onc/docs/onc_spec.md
    * @description
    * **NOTE**
    * Most interface properties and type values use UpperCamelCase to match
    * the ONC specification instead of the JavaScript lowerCamelCase convention.
    */
  val onc: Typeofonc
}
object Typeofnetworking {
  
  inline def apply(config: Typeofconfig, onc: Typeofonc): Typeofnetworking = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onc = onc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetworking]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofnetworking] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: Typeofconfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setOnc(value: Typeofonc): Self = StObject.set(x, "onc", value.asInstanceOf[js.Any])
  }
}
