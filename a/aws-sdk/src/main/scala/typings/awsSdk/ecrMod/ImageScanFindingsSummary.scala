package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanFindingsSummary extends js.Object {
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.native
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.native
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.native
}

object ImageScanFindingsSummary {
  @scala.inline
  def apply(): ImageScanFindingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindingsSummary]
  }
  @scala.inline
  implicit class ImageScanFindingsSummaryOps[Self <: ImageScanFindingsSummary] (val x: Self) extends AnyVal {
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
    def setFindingSeverityCounts(value: FindingSeverityCounts): Self = this.set("findingSeverityCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingSeverityCounts: Self = this.set("findingSeverityCounts", js.undefined)
    @scala.inline
    def setImageScanCompletedAt(value: ScanTimestamp): Self = this.set("imageScanCompletedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageScanCompletedAt: Self = this.set("imageScanCompletedAt", js.undefined)
    @scala.inline
    def setVulnerabilitySourceUpdatedAt(value: VulnerabilitySourceUpdateTimestamp): Self = this.set("vulnerabilitySourceUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVulnerabilitySourceUpdatedAt: Self = this.set("vulnerabilitySourceUpdatedAt", js.undefined)
  }
  
}

