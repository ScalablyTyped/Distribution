package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPU extends js.Object {
  /**
    * The CPU's architecture (for example, x86 or ARM).
    */
  var architecture: js.UndefOr[String] = js.native
  /**
    * The clock speed of the device's CPU, expressed in hertz (Hz). For example, a 1.2 GHz CPU is expressed as 1200000000.
    */
  var clock: js.UndefOr[Double] = js.native
  /**
    * The CPU's frequency.
    */
  var frequency: js.UndefOr[String] = js.native
}

object CPU {
  @scala.inline
  def apply(architecture: String = null, clock: Int | scala.Double = null, frequency: String = null): CPU = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (clock != null) __obj.updateDynamic("clock")(clock.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPU]
  }
}

