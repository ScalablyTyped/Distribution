package typings.deezerDashSdk.DeezerSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://developers.deezer.com/sdk/javascript/getloginstatus | DZ.getLoginStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.deezerDashSdk.deezerDashSdkStrings.connected
  - typings.deezerDashSdk.deezerDashSdkStrings.notConnected
  - typings.deezerDashSdk.deezerDashSdkStrings.unknown
  - typings.deezerDashSdk.deezerDashSdkStrings.not_authorized
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typings.deezerDashSdk.deezerDashSdkStrings.connected = this.cast("connected")
  @scala.inline
  def notConnected: typings.deezerDashSdk.deezerDashSdkStrings.notConnected = this.cast("notConnected")
  @scala.inline
  def not_authorized: typings.deezerDashSdk.deezerDashSdkStrings.not_authorized = this.cast("not_authorized")
  @scala.inline
  def unknown: typings.deezerDashSdk.deezerDashSdkStrings.unknown = this.cast("unknown")
}

