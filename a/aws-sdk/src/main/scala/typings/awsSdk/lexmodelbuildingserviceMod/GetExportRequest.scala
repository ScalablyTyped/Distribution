package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportRequest extends js.Object {
  /**
    * The format of the exported data.
    */
  var exportType: ExportType = js.native
  /**
    * The name of the bot to export.
    */
  var name: Name = js.native
  /**
    * The type of resource to export. 
    */
  var resourceType: ResourceType = js.native
  /**
    * The version of the bot to export.
    */
  var version: NumericalVersion = js.native
}

object GetExportRequest {
  @scala.inline
  def apply(exportType: ExportType, name: Name, resourceType: ResourceType, version: NumericalVersion): GetExportRequest = {
    val __obj = js.Dynamic.literal(exportType = exportType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportRequest]
  }
  @scala.inline
  implicit class GetExportRequestOps[Self <: GetExportRequest] (val x: Self) extends AnyVal {
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
    def setExportType(value: ExportType): Self = this.set("exportType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: NumericalVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

