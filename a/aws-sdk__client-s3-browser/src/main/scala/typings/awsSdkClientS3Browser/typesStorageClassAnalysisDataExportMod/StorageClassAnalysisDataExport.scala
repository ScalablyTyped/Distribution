package typings.awsSdkClientS3Browser.typesStorageClassAnalysisDataExportMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.V_1
import typings.awsSdkClientS3Browser.typesAnalyticsExportDestinationMod.AnalyticsExportDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageClassAnalysisDataExport extends js.Object {
  /**
    * <p>The place to store the data for an analysis.</p>
    */
  var Destination: AnalyticsExportDestination = js.native
  /**
    * <p>The version of the output schema to use when exporting data. Must be V_1.</p>
    */
  var OutputSchemaVersion: V_1 | String = js.native
}

object StorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: V_1 | String): StorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClassAnalysisDataExport]
  }
  @scala.inline
  implicit class StorageClassAnalysisDataExportOps[Self <: StorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
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
    def setDestination(value: AnalyticsExportDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputSchemaVersion(value: V_1 | String): Self = this.set("OutputSchemaVersion", value.asInstanceOf[js.Any])
  }
  
}

