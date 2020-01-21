package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClassAnalysisDataExport extends js.Object {
  /**
    * The place to store the data for an analysis.
    */
  var Destination: AnalyticsExportDestination = js.native
  /**
    * The version of the output schema to use when exporting data. Must be V_1.
    */
  var OutputSchemaVersion: StorageClassAnalysisSchemaVersion = js.native
}

object StorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: StorageClassAnalysisSchemaVersion): StorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StorageClassAnalysisDataExport]
  }
}

