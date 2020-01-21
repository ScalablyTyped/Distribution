package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPUUtilization extends js.Object {
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the I/O Wait state over the last 10 seconds.
    */
  var IOWait: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the IRQ state over the last 10 seconds.
    */
  var IRQ: js.UndefOr[NullableDouble] = js.native
  /**
    * Percentage of time that the CPU has spent in the Idle state over the last 10 seconds.
    */
  var Idle: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the Nice state over the last 10 seconds.
    */
  var Nice: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Windows environments only. Percentage of time that the CPU has spent in the Privileged state over the last 10 seconds.
    */
  var Privileged: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the SoftIRQ state over the last 10 seconds.
    */
  var SoftIRQ: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the System state over the last 10 seconds.
    */
  var System: js.UndefOr[NullableDouble] = js.native
  /**
    * Percentage of time that the CPU has spent in the User state over the last 10 seconds.
    */
  var User: js.UndefOr[NullableDouble] = js.native
}

object CPUUtilization {
  @scala.inline
  def apply(
    IOWait: Int | Double = null,
    IRQ: Int | Double = null,
    Idle: Int | Double = null,
    Nice: Int | Double = null,
    Privileged: Int | Double = null,
    SoftIRQ: Int | Double = null,
    System: Int | Double = null,
    User: Int | Double = null
  ): CPUUtilization = {
    val __obj = js.Dynamic.literal()
    if (IOWait != null) __obj.updateDynamic("IOWait")(IOWait.asInstanceOf[js.Any])
    if (IRQ != null) __obj.updateDynamic("IRQ")(IRQ.asInstanceOf[js.Any])
    if (Idle != null) __obj.updateDynamic("Idle")(Idle.asInstanceOf[js.Any])
    if (Nice != null) __obj.updateDynamic("Nice")(Nice.asInstanceOf[js.Any])
    if (Privileged != null) __obj.updateDynamic("Privileged")(Privileged.asInstanceOf[js.Any])
    if (SoftIRQ != null) __obj.updateDynamic("SoftIRQ")(SoftIRQ.asInstanceOf[js.Any])
    if (System != null) __obj.updateDynamic("System")(System.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUUtilization]
  }
}

