package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStorageClassAnalysisMod

import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreStorageClassAnalysisDataExportMod._UnmarshalledStorageClassAnalysisDataExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledStorageClassAnalysis extends _StorageClassAnalysis {
  /**
    * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
    */
  @JSName("DataExport")
  var DataExport__UnmarshalledStorageClassAnalysis: js.UndefOr[_UnmarshalledStorageClassAnalysisDataExport] = js.undefined
}

object _UnmarshalledStorageClassAnalysis {
  @scala.inline
  def apply(DataExport: _UnmarshalledStorageClassAnalysisDataExport = null): _UnmarshalledStorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    if (DataExport != null) __obj.updateDynamic("DataExport")(DataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledStorageClassAnalysis]
  }
}

