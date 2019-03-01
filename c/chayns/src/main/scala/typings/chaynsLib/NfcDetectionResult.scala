package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startNfcDetection()
trait NfcDetectionResult extends js.Object {
  var connected: scala.Boolean
  var rfid: java.lang.String
}

object NfcDetectionResult {
  @scala.inline
  def apply(connected: scala.Boolean, rfid: java.lang.String): NfcDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connected")(connected)
    __obj.updateDynamic("rfid")(rfid)
    __obj.asInstanceOf[NfcDetectionResult]
  }
}

