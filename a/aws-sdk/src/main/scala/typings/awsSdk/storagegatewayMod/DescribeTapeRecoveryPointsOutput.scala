package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapeRecoveryPointsOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * An opaque string that indicates the position at which the virtual tape recovery points that were listed for description ended. Use this marker in your next request to list the next set of virtual tape recovery points in the list. If there are no more recovery points to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of TapeRecoveryPointInfos that are available for the specified gateway.
    */
  var TapeRecoveryPointInfos: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeRecoveryPointInfos] = js.native
}

object DescribeTapeRecoveryPointsOutput {
  @scala.inline
  def apply(): DescribeTapeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeRecoveryPointsOutput]
  }
  @scala.inline
  implicit class DescribeTapeRecoveryPointsOutputOps[Self <: DescribeTapeRecoveryPointsOutput] (val x: Self) extends AnyVal {
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
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTapeRecoveryPointInfosVarargs(value: TapeRecoveryPointInfo*): Self = this.set("TapeRecoveryPointInfos", js.Array(value :_*))
    @scala.inline
    def setTapeRecoveryPointInfos(value: TapeRecoveryPointInfos): Self = this.set("TapeRecoveryPointInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeRecoveryPointInfos: Self = this.set("TapeRecoveryPointInfos", js.undefined)
  }
  
}

