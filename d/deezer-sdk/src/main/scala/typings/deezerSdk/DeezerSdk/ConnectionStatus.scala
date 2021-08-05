package typings.deezerSdk.DeezerSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerSdk.deezerSdkStrings.connected
  - typings.deezerSdk.deezerSdkStrings.notConnected
  - typings.deezerSdk.deezerSdkStrings.unknown
  - typings.deezerSdk.deezerSdkStrings.not_authorized
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  inline def connected: typings.deezerSdk.deezerSdkStrings.connected = "connected".asInstanceOf[typings.deezerSdk.deezerSdkStrings.connected]
  
  inline def notConnected: typings.deezerSdk.deezerSdkStrings.notConnected = "notConnected".asInstanceOf[typings.deezerSdk.deezerSdkStrings.notConnected]
  
  inline def not_authorized: typings.deezerSdk.deezerSdkStrings.not_authorized = "not_authorized".asInstanceOf[typings.deezerSdk.deezerSdkStrings.not_authorized]
  
  inline def unknown: typings.deezerSdk.deezerSdkStrings.unknown = "unknown".asInstanceOf[typings.deezerSdk.deezerSdkStrings.unknown]
}
