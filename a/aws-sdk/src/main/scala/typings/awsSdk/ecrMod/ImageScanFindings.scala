package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageScanFindings extends js.Object {
  /**
    * The image vulnerability counts, sorted by severity.
    */
  var findingSeverityCounts: js.UndefOr[FindingSeverityCounts] = js.native
  /**
    * The findings from the image scan.
    */
  var findings: js.UndefOr[ImageScanFindingList] = js.native
  /**
    * The time of the last completed image scan.
    */
  var imageScanCompletedAt: js.UndefOr[ScanTimestamp] = js.native
  /**
    * The time when the vulnerability data was last scanned.
    */
  var vulnerabilitySourceUpdatedAt: js.UndefOr[VulnerabilitySourceUpdateTimestamp] = js.native
}

object ImageScanFindings {
  @scala.inline
  def apply(): ImageScanFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFindings]
  }
  @scala.inline
  implicit class ImageScanFindingsOps[Self <: ImageScanFindings] (val x: Self) extends AnyVal {
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
    def setFindingsVarargs(value: ImageScanFinding*): Self = this.set("findings", js.Array(value :_*))
    @scala.inline
    def setFindings(value: ImageScanFindingList): Self = this.set("findings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
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

