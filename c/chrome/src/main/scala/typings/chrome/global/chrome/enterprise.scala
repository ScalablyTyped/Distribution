package typings.chrome.global.chrome

import typings.chrome.chrome.enterprise.networkingAttributes.NetworkDetails
import typings.chrome.chrome.enterprise.platformKeys.Token
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enterprise {
  
  ////////////////////
  // Enterprise Device Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.deviceAttributes</code> API to read device attributes.
    * Permissions:  "enterprise.deviceAttributes"
    * Since: Chrome 46
    * Important: This API works only on Chrome OS.
    * Note: This API is only for extensions pre-installed by policy.
    */
  object deviceAttributes {
    
    @JSGlobal("chrome.enterprise.deviceAttributes.getDeviceAnnotatedLocation")
    @js.native
    def getDeviceAnnotatedLocation(callback: js.Function1[/* annotatedLocation */ String, Unit]): Unit = js.native
    
    @JSGlobal("chrome.enterprise.deviceAttributes.getDeviceAssetId")
    @js.native
    def getDeviceAssetId(callback: js.Function1[/* assetId */ String, Unit]): Unit = js.native
    
    @JSGlobal("chrome.enterprise.deviceAttributes.getDeviceSerialNumber")
    @js.native
    def getDeviceSerialNumber(callback: js.Function1[/* serialNumber */ String, Unit]): Unit = js.native
    
    @JSGlobal("chrome.enterprise.deviceAttributes.getDirectoryDeviceId")
    @js.native
    def getDirectoryDeviceId(callback: js.Function1[/* deviceId */ String, Unit]): Unit = js.native
  }
  
  ////////////////////
  // Enterprise Networking Attributes
  ////////////////////
  /**
    * Use the <code>chrome.enterprise.networkingAttributes</code> API to read information about your current network. Note: This API is only available to extensions force-installed by enterprise policy.
    * Important: This API works only on Chrome OS.
    * @since Chrome 85.
    */
  object networkingAttributes {
    
    @JSGlobal("chrome.enterprise.networkingAttributes.getNetworkDetails")
    @js.native
    def getNetworkDetails(callback: js.Function1[/* networkDetails */ NetworkDetails, Unit]): Unit = js.native
  }
  
  ////////////////////
  // Enterprise Platform Keys
  ////////////////////
  /**
    * Use the chrome.enterprise.platformKeys API to generate hardware-backed keys and to install certificates for these keys. The certificates will be managed by the platform and can be used for TLS authentication, network access or by other extension through chrome.platformKeys.
    * Availability: Since Chrome 37.
    * Permissions:  "enterprise.platformKeys"
    * Important: This API works only on Chrome OS.
    * Note:  This API is only for extensions pre-installed by policy.
    */
  object platformKeys {
    
    @JSGlobal("chrome.enterprise.platformKeys.challengeMachineKey")
    @js.native
    def challengeMachineKey(challenge: ArrayBuffer, callback: js.Function1[/* response */ ArrayBuffer, Unit]): Unit = js.native
    @JSGlobal("chrome.enterprise.platformKeys.challengeMachineKey")
    @js.native
    def challengeMachineKey(
      challenge: ArrayBuffer,
      registerKey: Boolean,
      callback: js.Function1[/* response */ ArrayBuffer, Unit]
    ): Unit = js.native
    
    @JSGlobal("chrome.enterprise.platformKeys.challengeUserKey")
    @js.native
    def challengeUserKey(
      challenge: ArrayBuffer,
      registerKey: Boolean,
      callback: js.Function1[/* response */ ArrayBuffer, Unit]
    ): Unit = js.native
    
    @JSGlobal("chrome.enterprise.platformKeys.getCertificates")
    @js.native
    def getCertificates(tokenId: String, callback: js.Function1[/* certificates */ js.Array[ArrayBuffer], Unit]): Unit = js.native
    
    @JSGlobal("chrome.enterprise.platformKeys.getTokens")
    @js.native
    def getTokens(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
    
    @JSGlobal("chrome.enterprise.platformKeys.importCertificate")
    @js.native
    def importCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
    @JSGlobal("chrome.enterprise.platformKeys.importCertificate")
    @js.native
    def importCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("chrome.enterprise.platformKeys.removeCertificate")
    @js.native
    def removeCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
    @JSGlobal("chrome.enterprise.platformKeys.removeCertificate")
    @js.native
    def removeCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  }
}
