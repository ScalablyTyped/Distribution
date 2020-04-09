package typings.chrome.chrome.loginState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.chrome.chromeStrings.SIGNIN_PROFILE
  - typings.chrome.chromeStrings.USER_PROFILE
*/
trait ProfileType extends js.Object

object ProfileType {
  @scala.inline
  def SIGNIN_PROFILE: typings.chrome.chromeStrings.SIGNIN_PROFILE = this.cast("SIGNIN_PROFILE")
  @scala.inline
  def USER_PROFILE: typings.chrome.chromeStrings.USER_PROFILE = this.cast("USER_PROFILE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

