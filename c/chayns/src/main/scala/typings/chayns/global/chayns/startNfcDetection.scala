package typings.chayns.global.chayns

import typings.chayns.NfcDetectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.startNfcDetection")
@js.native
object startNfcDetection extends js.Object {
  def apply(callback: js.Function1[/* result */ NfcDetectionResult, _], interval: Double, vibrate: Boolean): js.Promise[_] = js.native
}

