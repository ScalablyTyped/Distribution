package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStorageClassAnalysisMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStorageClassAnalysisDataExportMod._StorageClassAnalysisDataExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StorageClassAnalysis extends js.Object {
  /**
    * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
    */
  var DataExport: js.UndefOr[_StorageClassAnalysisDataExport] = js.undefined
}

object _StorageClassAnalysis {
  @scala.inline
  def apply(DataExport: _StorageClassAnalysisDataExport = null): _StorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    if (DataExport != null) __obj.updateDynamic("DataExport")(DataExport)
    __obj.asInstanceOf[_StorageClassAnalysis]
  }
}

