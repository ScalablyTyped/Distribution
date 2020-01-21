package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerFailure extends js.Object {
  /**
    * The failure code associated with the failure.
    */
  var failureCode: js.UndefOr[LayerFailureCode] = js.native
  /**
    * The reason for the failure.
    */
  var failureReason: js.UndefOr[LayerFailureReason] = js.native
  /**
    * The layer digest associated with the failure.
    */
  var layerDigest: js.UndefOr[BatchedOperationLayerDigest] = js.native
}

object LayerFailure {
  @scala.inline
  def apply(
    failureCode: LayerFailureCode = null,
    failureReason: LayerFailureReason = null,
    layerDigest: BatchedOperationLayerDigest = null
  ): LayerFailure = {
    val __obj = js.Dynamic.literal()
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (layerDigest != null) __obj.updateDynamic("layerDigest")(layerDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerFailure]
  }
}

