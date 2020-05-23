package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanaryLastRun extends js.Object {
  /**
    * The name of the canary.
    */
  var CanaryName: js.UndefOr[typings.awsSdk.syntheticsMod.CanaryName] = js.native
  /**
    * The results from this canary's most recent run.
    */
  var LastRun: js.UndefOr[CanaryRun] = js.native
}

object CanaryLastRun {
  @scala.inline
  def apply(CanaryName: CanaryName = null, LastRun: CanaryRun = null): CanaryLastRun = {
    val __obj = js.Dynamic.literal()
    if (CanaryName != null) __obj.updateDynamic("CanaryName")(CanaryName.asInstanceOf[js.Any])
    if (LastRun != null) __obj.updateDynamic("LastRun")(LastRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanaryLastRun]
  }
}

