package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReceiverType extends js.Object

@JSGlobal("chrome.cast.ReceiverType")
@js.native
object ReceiverType extends js.Object {
  @js.native
  sealed trait CAST
    extends chromeLib.chromeNs.castNs.ReceiverType
  
  @js.native
  sealed trait CUSTOM
    extends chromeLib.chromeNs.castNs.ReceiverType
  
  @js.native
  sealed trait DIAL
    extends chromeLib.chromeNs.castNs.ReceiverType
  
  @js.native
  sealed trait HANGOUT
    extends chromeLib.chromeNs.castNs.ReceiverType
  
  /* "cast" */ val CAST: CAST with java.lang.String = js.native
  /* "custom" */ val CUSTOM: CUSTOM with java.lang.String = js.native
  /* "dial" */ val DIAL: DIAL with java.lang.String = js.native
  /* "hangout" */ val HANGOUT: HANGOUT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[chromeLib.chromeNs.castNs.ReceiverType with java.lang.String] = js.native
}

