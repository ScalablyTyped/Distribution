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
  def apply(): DescribeTapeArchivesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTapeArchivesOutput]
  }
  @scala.inline
  implicit class DescribeTapeArchivesOutputOps[Self <: DescribeTapeArchivesOutput] (val x: Self) extends AnyVal {
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
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTapeArchivesVarargs(value: TapeArchive*): Self = this.set("TapeArchives", js.Array(value :_*))
    @scala.inline
    def setTapeArchives(value: TapeArchives): Self = this.set("TapeArchives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapeArchives: Self = this.set("TapeArchives", js.undefined)
  }
  
}

