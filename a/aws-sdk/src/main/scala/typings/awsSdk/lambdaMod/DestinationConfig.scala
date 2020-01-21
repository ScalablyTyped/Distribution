package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationConfig extends js.Object {
  /**
    * The destination configuration for failed invocations.
    */
  var OnFailure: js.UndefOr[typings.awsSdk.lambdaMod.OnFailure] = js.native
  /**
    * The destination configuration for successful invocations.
    */
  var OnSuccess: js.UndefOr[typings.awsSdk.lambdaMod.OnSuccess] = js.native
}

object DestinationConfig {
  @scala.inline
  def apply(OnFailure: OnFailure = null, OnSuccess: OnSuccess = null): DestinationConfig = {
    val __obj = js.Dynamic.literal()
    if (OnFailure != null) __obj.updateDynamic("OnFailure")(OnFailure.asInstanceOf[js.Any])
    if (OnSuccess != null) __obj.updateDynamic("OnSuccess")(OnSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationConfig]
  }
}

