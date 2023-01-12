package typings.chromeApps.chrome.networking

import typings.chromeApps.anon.WIFI
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.None
import typings.chromeApps.chromeAppsStrings.WI_FI
import typings.chromeApps.chromeAppsStrings.`WEP-PSK`
import typings.chromeApps.chromeAppsStrings.`WPA-EAP`
import typings.chromeApps.chromeAppsStrings.`WPA-PSK`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object config {
  
  trait NetworkInfo extends StObject {
    
    /**
      * The basic service set identification (BSSID) uniquely identifying the
      * basic service set. *BSSID* is represented as a human readable,
      * hex-encoded string with bytes separated by colons, e.g.
      * 45:67:89:ab:cd:ef.
      */
    var BSSID: js.UndefOr[String] = js.undefined
    
    /** A unique identifier of the network. */
    var GUID: js.UndefOr[String] = js.undefined
    
    /**
      * A hex-encoded byte sequence.
      */
    var HexSSID: js.UndefOr[String] = js.undefined
    
    /**
      * The decoded SSID of the network (default encoding is UTF-8).
      * To filter for non-UTF-8 SSIDs, use HexSSID instead.
      */
    var SSID: js.UndefOr[String] = js.undefined
    
    /** Identifier indicating the security type of the network. */
    var Security: js.UndefOr[None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`] = js.undefined
    
    /** Currently only WiFi supported. */
    var Type: ToStringLiteral[
        WIFI, 
        WI_FI, 
        /* import warning: importer.ImportType#apply Failed type conversion: keyof {  WI_FI :'WiFi'} extends keyof {  WI_FI :'WiFi'} ? std.Exclude<keyof {  WI_FI :'WiFi'}, 'WiFi'> : never */ js.Any
      ]
  }
  object NetworkInfo {
    
    inline def apply(
      Type: ToStringLiteral[
          WIFI, 
          WI_FI, 
          /* import warning: importer.ImportType#apply Failed type conversion: keyof {  WI_FI :'WiFi'} extends keyof {  WI_FI :'WiFi'} ? std.Exclude<keyof {  WI_FI :'WiFi'}, 'WiFi'> : never */ js.Any
        ]
    ): NetworkInfo = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkInfo] (val x: Self) extends AnyVal {
      
      inline def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
      
      inline def setBSSIDUndefined: Self = StObject.set(x, "BSSID", js.undefined)
      
      inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
      
      inline def setGUIDUndefined: Self = StObject.set(x, "GUID", js.undefined)
      
      inline def setHexSSID(value: String): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
      
      inline def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
      
      inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
      
      inline def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
      
      inline def setSecurity(value: None | `WEP-PSK` | `WPA-PSK` | `WPA-EAP`): Self = StObject.set(x, "Security", value.asInstanceOf[js.Any])
      
      inline def setSecurityUndefined: Self = StObject.set(x, "Security", js.undefined)
      
      inline def setType(
        value: ToStringLiteral[
              WIFI, 
              WI_FI, 
              /* import warning: importer.ImportType#apply Failed type conversion: keyof {  WI_FI :'WiFi'} extends keyof {  WI_FI :'WiFi'} ? std.Exclude<keyof {  WI_FI :'WiFi'}, 'WiFi'> : never */ js.Any
            ]
      ): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkInfoFilterHexSSID extends StObject {
    
    /**
      * A hex-encoded byte sequence.
      */
    var HexSSID: js.UndefOr[String] = js.undefined
  }
  object NetworkInfoFilterHexSSID {
    
    inline def apply(): NetworkInfoFilterHexSSID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInfoFilterHexSSID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkInfoFilterHexSSID] (val x: Self) extends AnyVal {
      
      inline def setHexSSID(value: String): Self = StObject.set(x, "HexSSID", value.asInstanceOf[js.Any])
      
      inline def setHexSSIDUndefined: Self = StObject.set(x, "HexSSID", js.undefined)
    }
  }
  
  trait NetworkInfoFilterSSID extends StObject {
    
    /**
      * The decoded SSID of the network (default encoding is UTF-8).
      * To filter for non-UTF-8 SSIDs, use HexSSID instead.
      */
    var SSID: js.UndefOr[String] = js.undefined
  }
  object NetworkInfoFilterSSID {
    
    inline def apply(): NetworkInfoFilterSSID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkInfoFilterSSID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetworkInfoFilterSSID] (val x: Self) extends AnyVal {
      
      inline def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
      
      inline def setSSIDUndefined: Self = StObject.set(x, "SSID", js.undefined)
    }
  }
}
