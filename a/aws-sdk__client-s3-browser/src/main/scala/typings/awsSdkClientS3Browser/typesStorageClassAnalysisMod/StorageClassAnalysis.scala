package typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod

import typings.awsSdkClientS3Browser.typesStorageClassAnalysisDataExportMod.StorageClassAnalysisDataExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageClassAnalysis extends js.Object {
  /**
    * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
    */
  var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined
}

object StorageClassAnalysis {
  @scala.inline
  def apply(DataExport: StorageClassAnalysisDataExport = null): StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    if (DataExport != null) __obj.updateDynamic("DataExport")(DataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClassAnalysis]
  }
}

