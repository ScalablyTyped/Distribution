package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreStorageClassAnalysisDataExportMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.V_1
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAnalyticsExportDestinationMod._UnmarshalledAnalyticsExportDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledStorageClassAnalysisDataExport extends _StorageClassAnalysisDataExport {
  /**
    * <p>The place to store the data for an analysis.</p>
    */
  @JSName("Destination")
  var Destination__UnmarshalledStorageClassAnalysisDataExport: _UnmarshalledAnalyticsExportDestination
}

object _UnmarshalledStorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: _UnmarshalledAnalyticsExportDestination, OutputSchemaVersion: V_1 | String): _UnmarshalledStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_UnmarshalledStorageClassAnalysisDataExport]
  }
}

