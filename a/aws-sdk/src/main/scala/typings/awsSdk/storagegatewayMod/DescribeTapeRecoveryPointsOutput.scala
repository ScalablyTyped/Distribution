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
  def apply(
    GatewayARN: GatewayARN = null,
    Marker: Marker = null,
    TapeRecoveryPointInfos: TapeRecoveryPointInfos = null
  ): DescribeTapeRecoveryPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TapeRecoveryPointInfos != null) __obj.updateDynamic("TapeRecoveryPointInfos")(TapeRecoveryPointInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTapeRecoveryPointsOutput]
  }
}

