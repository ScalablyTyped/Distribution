package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreStorageClassAnalysisDataExportMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.V_1
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreAnalyticsExportDestinationMod._AnalyticsExportDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StorageClassAnalysisDataExport extends js.Object {
  /**
    * <p>The place to store the data for an analysis.</p>
    */
  var Destination: _AnalyticsExportDestination
  /**
    * <p>The version of the output schema to use when exporting data. Must be V_1.</p>
    */
  var OutputSchemaVersion: V_1 | String
}

object _StorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: _AnalyticsExportDestination, OutputSchemaVersion: V_1 | String): _StorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination, OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_StorageClassAnalysisDataExport]
  }
}

