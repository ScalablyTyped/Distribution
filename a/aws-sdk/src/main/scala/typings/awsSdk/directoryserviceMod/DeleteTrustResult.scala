package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrustResult extends js.Object {
  /**
    * The Trust ID of the trust relationship that was deleted.
    */
  var TrustId: js.UndefOr[typings.awsSdk.directoryserviceMod.TrustId] = js.native
}

object DeleteTrustResult {
  @scala.inline
  def apply(): DeleteTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrustResult]
  }
  @scala.inline
  implicit class DeleteTrustResultOps[Self <: DeleteTrustResult] (val x: Self) extends AnyVal {
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
    def setTrustId(value: TrustId): Self = this.set("TrustId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustId: Self = this.set("TrustId", js.undefined)
  }
  
}

