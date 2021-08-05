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
  
  inline def apply(): GetImportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetImportResponse]
  }
  
  extension [Self <: GetImportResponse](x: Self) {
    
    inline def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setFailureReason(value: StringList): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setFailureReasonVarargs(value: String*): Self = StObject.set(x, "failureReason", js.Array(value :_*))
    
    inline def setImportId(value: String): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
