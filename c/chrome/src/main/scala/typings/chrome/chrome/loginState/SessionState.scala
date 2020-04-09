package typings.chrome.chrome.loginState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.UNKNOWN
  - typings.chrome.chromeStrings.IN_OOBE_SCREEN
  - typings.chrome.chromeStrings.IN_LOGIN_SCREEN
  - typings.chrome.chromeStrings.IN_SESSION
  - typings.chrome.chromeStrings.IN_LOCK_SCREEN
*/
trait SessionState extends js.Object

object SessionState {
  @scala.inline
  def IN_LOCK_SCREEN: typings.chrome.chromeStrings.IN_LOCK_SCREEN = this.cast("IN_LOCK_SCREEN")
  @scala.inline
  def IN_LOGIN_SCREEN: typings.chrome.chromeStrings.IN_LOGIN_SCREEN = this.cast("IN_LOGIN_SCREEN")
  @scala.inline
  def IN_OOBE_SCREEN: typings.chrome.chromeStrings.IN_OOBE_SCREEN = this.cast("IN_OOBE_SCREEN")
  @scala.inline
  def IN_SESSION: typings.chrome.chromeStrings.IN_SESSION = this.cast("IN_SESSION")
  @scala.inline
  def UNKNOWN: typings.chrome.chromeStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

