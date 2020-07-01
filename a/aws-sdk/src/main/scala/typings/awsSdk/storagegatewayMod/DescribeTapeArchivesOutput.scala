package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapeArchivesOutput extends js.Object {
  /**
    * An opaque string that indicates the position at which the virtual tapes that were fetched for description ended. Use this marker in your next request to fetch the next set of virtual tapes in the virtual tape shelf (VTS). If there are no more virtual tapes to describe, this field does not appear in the response.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.native
  /**
    * An array of virtual tape objects in the virtual tape shelf (VTS). The description includes of the Amazon Resource Name (ARN) of the virtual tapes. The information returned includes the Amazon Resource Names (ARNs) of the tapes, size of the tapes, status of the tapes, progress of the description, and tape barcode.
    */
  var TapeArchives: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeArchives] = js.native
}

object DescribeTapeArchivesOutput {
  @scala.inline
  def apply(Marker: Marker = null, TapeArchives: TapeArchives = null): DescribeTapeArchivesOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TapeArchives != null) __obj.updateDynamic("TapeArchives")(TapeArchives.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTapeArchivesOutput]
  }
}

