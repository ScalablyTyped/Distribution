package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SenderPlatform extends js.Object

@JSGlobal("chrome.cast.SenderPlatform")
@js.native
object SenderPlatform extends js.Object {
  @js.native
  sealed trait ANDROID extends SenderPlatform
  
  @js.native
  sealed trait CHROME extends SenderPlatform
  
  @js.native
  sealed trait IOS extends SenderPlatform
  
  /* "android" */ val ANDROID: typings.chrome.chrome.cast.SenderPlatform.ANDROID with String = js.native
  /* "chrome" */ val CHROME: typings.chrome.chrome.cast.SenderPlatform.CHROME with String = js.native
  /* "ios" */ val IOS: typings.chrome.chrome.cast.SenderPlatform.IOS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SenderPlatform with String] = js.native
}

