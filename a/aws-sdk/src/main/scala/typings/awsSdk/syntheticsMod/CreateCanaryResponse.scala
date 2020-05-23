package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCanaryResponse extends js.Object {
  /**
    * The full details about the canary you have created.
    */
  var Canary: js.UndefOr[typings.awsSdk.syntheticsMod.Canary] = js.native
}

object CreateCanaryResponse {
  @scala.inline
  def apply(Canary: Canary = null): CreateCanaryResponse = {
    val __obj = js.Dynamic.literal()
    if (Canary != null) __obj.updateDynamic("Canary")(Canary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCanaryResponse]
  }
}

