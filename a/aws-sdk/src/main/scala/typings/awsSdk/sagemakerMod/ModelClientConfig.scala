package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelClientConfig extends js.Object {
  /**
    * The maximum number of retries when invocation requests are failing.
    */
  var InvocationsMaxRetries: js.UndefOr[typings.awsSdk.sagemakerMod.InvocationsMaxRetries] = js.native
  /**
    * The timeout value in seconds for an invocation request.
    */
  var InvocationsTimeoutInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.InvocationsTimeoutInSeconds] = js.native
}

object ModelClientConfig {
  @scala.inline
  def apply(
    InvocationsMaxRetries: js.UndefOr[InvocationsMaxRetries] = js.undefined,
    InvocationsTimeoutInSeconds: js.UndefOr[InvocationsTimeoutInSeconds] = js.undefined
  ): ModelClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InvocationsMaxRetries)) __obj.updateDynamic("InvocationsMaxRetries")(InvocationsMaxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(InvocationsTimeoutInSeconds)) __obj.updateDynamic("InvocationsTimeoutInSeconds")(InvocationsTimeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelClientConfig]
  }
}

