package typings.chromeDashApps.chrome.tts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.tts.isSpeaking")
@js.native
object isSpeaking extends js.Object {
  /** Checks whether the engine is currently speaking. On Mac OS X, the result is true whenever the system speech engine is speaking, even if the speech wasn't initiated by Chrome. */
  def apply(): Unit = js.native
  def apply(callback: js.Function1[/* speaking */ Boolean, Unit]): Unit = js.native
}

