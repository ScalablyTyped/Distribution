package typings.chromeApps.chrome.bluetoothLowEnergy

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.setAdvertisingInterval")
@js.native
object setAdvertisingInterval extends js.Object {
  /**
    * Set's the interval betweeen two consecutive advertisements.
    * Note: This is a best effort.
    * The actual interval may consty non-trivially from the requested intervals.
    * On some hardware, there is a minimum interval of 100ms.
    * The minimum and maximum values cannot exceed the the range allowed by the Bluetooth 4.2 specification.
    * @since Chrome 55.
    * @param minInterval Minimum interval between advertisments (in milliseconds). This cannot be lower than 20ms (as per the spec).
    * @param maxInterval Maximum interval between advertisments (in milliseconds). This cannot be more than 10240ms (as per the spec).
    * @param callback Called once the interval has been set.
    */
  def apply(minInterval: integer, maxInterval: integer, callback: js.Function0[Unit]): Unit = js.native
}

