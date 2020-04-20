package typings.awsSdkClientS3Node.typesStorageClassAnalysisDataExportMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.V_1
import typings.awsSdkClientS3Node.typesAnalyticsExportDestinationMod.UnmarshalledAnalyticsExportDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledStorageClassAnalysisDataExport extends StorageClassAnalysisDataExport {
  /**
    * <p>The place to store the data for an analysis.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledStorageClassAnalysisDataExport: UnmarshalledAnalyticsExportDestination
}

object UnmarshalledStorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: UnmarshalledAnalyticsExportDestination, OutputSchemaVersion: V_1 | String): UnmarshalledStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStorageClassAnalysisDataExport]
  }
}

