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
  def IN_LOCK_SCREEN: typings.chrome.chromeStrings.IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[typings.chrome.chromeStrings.IN_LOCK_SCREEN]
  @scala.inline
  def IN_LOGIN_SCREEN: typings.chrome.chromeStrings.IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[typings.chrome.chromeStrings.IN_LOGIN_SCREEN]
  @scala.inline
  def IN_OOBE_SCREEN: typings.chrome.chromeStrings.IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[typings.chrome.chromeStrings.IN_OOBE_SCREEN]
  @scala.inline
  def IN_SESSION: typings.chrome.chromeStrings.IN_SESSION = "IN_SESSION".asInstanceOf[typings.chrome.chromeStrings.IN_SESSION]
  @scala.inline
  def UNKNOWN: typings.chrome.chromeStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.chrome.chromeStrings.UNKNOWN]
}

