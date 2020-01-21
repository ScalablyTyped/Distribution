package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartImportResponse extends js.Object {
  /**
    * A timestamp for the date and time that the import job was requested.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier for the specific import job.
    */
  var importId: js.UndefOr[String] = js.native
  /**
    * The status of the import job. If the status is FAILED, you can get the reason for the failure using the GetImport operation.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.native
  /**
    * The action to take when there is a merge conflict.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.native
  /**
    * The name given to the import job.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of resource to import.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object StartImportResponse {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    importId: String = null,
    importStatus: ImportStatus = null,
    mergeStrategy: MergeStrategy = null,
    name: Name = null,
    resourceType: ResourceType = null
  ): StartImportResponse = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (importId != null) __obj.updateDynamic("importId")(importId.asInstanceOf[js.Any])
    if (importStatus != null) __obj.updateDynamic("importStatus")(importStatus.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportResponse]
  }
}

