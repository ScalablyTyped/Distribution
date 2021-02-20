package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartImportResponse extends StObject {
  
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
  implicit class StartImportResponseMutableBuilder[Self <: StartImportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setImportId(value: String): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    @scala.inline
    def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
    
    @scala.inline
    def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
