package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportResponse extends js.Object {
  /**
    * The status of the export.     IN_PROGRESS - The export is in progress.    READY - The export is complete.    FAILED - The export could not be completed.  
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.native
  /**
    * The format of the exported data.
    */
  var exportType: js.UndefOr[ExportType] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to export the resource.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The name of the bot being exported.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of the exported resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive that contains the exported resource in JSON format. The structure of the archive may change. Your code should not rely on the archive structure.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The version of the bot being exported.
    */
  var version: js.UndefOr[NumericalVersion] = js.native
}

object GetExportResponse {
  @scala.inline
  def apply(): GetExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportResponse]
  }
  @scala.inline
  implicit class GetExportResponseOps[Self <: GetExportResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = this.set("exportStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportStatus: Self = this.set("exportStatus", js.undefined)
    @scala.inline
    def setExportType(value: ExportType): Self = this.set("exportType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportType: Self = this.set("exportType", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setVersion(value: NumericalVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

