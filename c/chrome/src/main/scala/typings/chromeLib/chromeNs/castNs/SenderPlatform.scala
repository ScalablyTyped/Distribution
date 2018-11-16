package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SenderPlatform extends js.Object

@JSGlobal("chrome.cast.SenderPlatform")
@js.native
object SenderPlatform extends js.Object {
  @js.native
  sealed trait ANDROID
    extends chromeLib.chromeNs.castNs.SenderPlatform
  
  @js.native
  sealed trait CHROME
    extends chromeLib.chromeNs.castNs.SenderPlatform
  
  @js.native
  sealed trait IOS
    extends chromeLib.chromeNs.castNs.SenderPlatform
  
  /* "android" */ val ANDROID: ANDROID with java.lang.String = js.native
  /* "chrome" */ val CHROME: CHROME with java.lang.String = js.native
  /* "ios" */ val IOS: IOS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.SenderPlatform with java.lang.String] = js.native
}

