package typings.awsSdkClientS3Browser.typesStorageClassAnalysisMod

import typings.awsSdkClientS3Browser.typesStorageClassAnalysisDataExportMod.UnmarshalledStorageClassAnalysisDataExport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledStorageClassAnalysis extends StorageClassAnalysis {
  /**
    * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
    */
  @JSName("DataExport")
  var DataExport_UnmarshalledStorageClassAnalysis: js.UndefOr[UnmarshalledStorageClassAnalysisDataExport] = js.undefined
}

object UnmarshalledStorageClassAnalysis {
  @scala.inline
  def apply(DataExport: UnmarshalledStorageClassAnalysisDataExport = null): UnmarshalledStorageClassAnalysis = {
    val __obj = js.Dynamic.literal()
    if (DataExport != null) __obj.updateDynamic("DataExport")(DataExport.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStorageClassAnalysis]
  }
}

