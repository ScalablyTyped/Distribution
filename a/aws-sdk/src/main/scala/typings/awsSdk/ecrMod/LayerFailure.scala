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
  def apply(): LayerFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerFailure]
  }
  @scala.inline
  implicit class LayerFailureOps[Self <: LayerFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailureCode(value: LayerFailureCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("failureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: LayerFailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setLayerDigest(value: BatchedOperationLayerDigest): Self = this.set("layerDigest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerDigest: Self = this.set("layerDigest", js.undefined)
  }
  
}

