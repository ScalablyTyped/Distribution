package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCanaryResponse extends js.Object {
  /**
    * A strucure that contains the full information about the canary.
    */
  var Canary: js.UndefOr[typings.awsSdk.syntheticsMod.Canary] = js.native
}

object GetCanaryResponse {
  @scala.inline
  def apply(Canary: Canary = null): GetCanaryResponse = {
    val __obj = js.Dynamic.literal()
    if (Canary != null) __obj.updateDynamic("Canary")(Canary.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCanaryResponse]
  }
}

