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
}

