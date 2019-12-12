package typings.chrome.chrome.cast

import org.scalablytyped.runtime.TopLevel
import typings.chrome.chrome.cast.SenderPlatform.ANDROID
import typings.chrome.chrome.cast.SenderPlatform.CHROME
import typings.chrome.chrome.cast.SenderPlatform.IOS
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SenderPlatform with String] = js.native
  /* "android" */ @js.native
  object ANDROID extends TopLevel[ANDROID with String]
  
  /* "chrome" */ @js.native
  object CHROME extends TopLevel[CHROME with String]
  
  /* "ios" */ @js.native
  object IOS extends TopLevel[IOS with String]
  
}

