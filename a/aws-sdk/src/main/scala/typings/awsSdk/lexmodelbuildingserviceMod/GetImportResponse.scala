package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImportResponse extends js.Object {
  /**
    * A timestamp for the date and time that the import job was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A string that describes why an import job failed to complete.
    */
  var failureReason: js.UndefOr[StringList] = js.native
  /**
    * The identifier for the specific import job.
    */
  var importId: js.UndefOr[String] = js.native
  /**
    * The status of the import job. If the status is FAILED, you can get the reason for the failure from the failureReason field.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.native
  /**
    * The action taken when there was a conflict between an existing resource and a resource in the import file.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.native
  /**
    * The name given to the import job.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The type of resource imported.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object GetImportResponse {
  @scala.inline
  def apply(): GetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportResponse]
  }
  @scala.inline
  implicit class GetImportResponseOps[Self <: GetImportResponse] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setFailureReasonVarargs(value: String*): Self = this.set("failureReason", js.Array(value :_*))
    @scala.inline
    def setFailureReason(value: StringList): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    @scala.inline
    def setImportId(value: String): Self = this.set("importId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportId: Self = this.set("importId", js.undefined)
    @scala.inline
    def setImportStatus(value: ImportStatus): Self = this.set("importStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportStatus: Self = this.set("importStatus", js.undefined)
    @scala.inline
    def setMergeStrategy(value: MergeStrategy): Self = this.set("mergeStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeStrategy: Self = this.set("mergeStrategy", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

