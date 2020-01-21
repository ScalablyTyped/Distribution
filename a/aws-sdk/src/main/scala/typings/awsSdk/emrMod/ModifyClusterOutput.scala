package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterOutput extends js.Object {
  /**
    * The number of steps that can be executed concurrently.
    */
  var StepConcurrencyLevel: js.UndefOr[Integer] = js.native
}

object ModifyClusterOutput {
  @scala.inline
  def apply(StepConcurrencyLevel: Int | Double = null): ModifyClusterOutput = {
    val __obj = js.Dynamic.literal()
    if (StepConcurrencyLevel != null) __obj.updateDynamic("StepConcurrencyLevel")(StepConcurrencyLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterOutput]
  }
}

