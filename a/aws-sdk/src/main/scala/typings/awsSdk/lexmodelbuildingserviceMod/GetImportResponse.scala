package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetImportResponse extends StObject {
  
  /**
    * A timestamp for the date and time that the import job was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A string that describes why an import job failed to complete.
    */
  var failureReason: js.UndefOr[StringList] = js.undefined
  
  /**
    * The identifier for the specific import job.
    */
  var importId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the import job. If the status is FAILED, you can get the reason for the failure from the failureReason field.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.undefined
  
  /**
    * The action taken when there was a conflict between an existing resource and a resource in the import file.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
  
  /**
    * The name given to the import job.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of resource imported.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
}
object GetImportResponse {
  
  @scala.inline
  def apply(): GetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportResponse]
  }
  
  @scala.inline
  implicit class GetImportResponseMutableBuilder[Self <: GetImportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setFailureReason(value: StringList): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setFailureReasonVarargs(value: String*): Self = StObject.set(x, "failureReason", js.Array(value :_*))
    
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
  }
}
