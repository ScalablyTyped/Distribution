package typings.awsSdkClientS3Node.typesStorageClassAnalysisDataExportMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.V_1
import typings.awsSdkClientS3Node.typesAnalyticsExportDestinationMod.AnalyticsExportDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageClassAnalysisDataExport extends js.Object {
  /**
    * <p>The place to store the data for an analysis.</p>
    */
  var Destination: AnalyticsExportDestination
  /**
    * <p>The version of the output schema to use when exporting data. Must be V_1.</p>
    */
  var OutputSchemaVersion: V_1 | String
}

object StorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: V_1 | String): StorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClassAnalysisDataExport]
  }
}

