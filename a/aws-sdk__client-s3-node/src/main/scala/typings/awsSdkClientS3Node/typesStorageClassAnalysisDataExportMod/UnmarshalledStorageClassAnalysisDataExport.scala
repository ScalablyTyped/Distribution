package typings.awsSdkClientS3Node.typesStorageClassAnalysisDataExportMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.V_1
import typings.awsSdkClientS3Node.typesAnalyticsExportDestinationMod.UnmarshalledAnalyticsExportDestination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledStorageClassAnalysisDataExport extends StorageClassAnalysisDataExport {
  /**
    * <p>The place to store the data for an analysis.</p>
    */
  @JSName("Destination")
  var Destination_UnmarshalledStorageClassAnalysisDataExport: UnmarshalledAnalyticsExportDestination = js.native
}

object UnmarshalledStorageClassAnalysisDataExport {
  @scala.inline
  def apply(Destination: UnmarshalledAnalyticsExportDestination, OutputSchemaVersion: V_1 | String): UnmarshalledStorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledStorageClassAnalysisDataExport]
  }
  @scala.inline
  implicit class UnmarshalledStorageClassAnalysisDataExportOps[Self <: UnmarshalledStorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
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
    def setDestination(value: UnmarshalledAnalyticsExportDestination): Self = this.set("Destination", value.asInstanceOf[js.Any])
  }
  
}

