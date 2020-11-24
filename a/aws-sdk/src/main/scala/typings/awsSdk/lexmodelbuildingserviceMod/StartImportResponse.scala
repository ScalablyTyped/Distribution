package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * A list of tags added to the imported bot.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object StartImportResponse {
  
  @scala.inline
  def apply(): StartImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartImportResponse]
  }
  
  @scala.inline
  implicit class StartImportResponseOps[Self <: StartImportResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
