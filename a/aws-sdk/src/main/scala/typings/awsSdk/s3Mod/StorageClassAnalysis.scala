package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClassAnalysis extends js.Object {
  /**
    * Specifies how data related to the storage class analysis for an Amazon S3 bucket should be exported.
    */
  var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.native
}

object StorageClassAnalysis {
  @scala.inline
  def apply(): StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageClassAnalysis]
  }
  @scala.inline
  implicit class StorageClassAnalysisOps[Self <: StorageClassAnalysis] (val x: Self) extends AnyVal {
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
    def setDataExport(value: StorageClassAnalysisDataExport): Self = this.set("DataExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataExport: Self = this.set("DataExport", js.undefined)
  }
  
}

