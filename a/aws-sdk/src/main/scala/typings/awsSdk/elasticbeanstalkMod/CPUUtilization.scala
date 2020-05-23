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
    IOWait: js.UndefOr[NullableDouble] = js.undefined,
    IRQ: js.UndefOr[NullableDouble] = js.undefined,
    Idle: js.UndefOr[NullableDouble] = js.undefined,
    Nice: js.UndefOr[NullableDouble] = js.undefined,
    Privileged: js.UndefOr[NullableDouble] = js.undefined,
    SoftIRQ: js.UndefOr[NullableDouble] = js.undefined,
    System: js.UndefOr[NullableDouble] = js.undefined,
    User: js.UndefOr[NullableDouble] = js.undefined
  ): CPUUtilization = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IOWait)) __obj.updateDynamic("IOWait")(IOWait.get.asInstanceOf[js.Any])
    if (!js.isUndefined(IRQ)) __obj.updateDynamic("IRQ")(IRQ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Idle)) __obj.updateDynamic("Idle")(Idle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Nice)) __obj.updateDynamic("Nice")(Nice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Privileged)) __obj.updateDynamic("Privileged")(Privileged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SoftIRQ)) __obj.updateDynamic("SoftIRQ")(SoftIRQ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(System)) __obj.updateDynamic("System")(System.get.asInstanceOf[js.Any])
    if (!js.isUndefined(User)) __obj.updateDynamic("User")(User.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUUtilization]
  }
}

