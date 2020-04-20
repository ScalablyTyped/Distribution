package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startNfcDetection()
trait NfcDetectionResult extends js.Object {
  var connected: Boolean
  var rfid: String
}

object NfcDetectionResult {
  @scala.inline
  def apply(connected: Boolean, rfid: String): NfcDetectionResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], rfid = rfid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NfcDetectionResult]
  }
}

