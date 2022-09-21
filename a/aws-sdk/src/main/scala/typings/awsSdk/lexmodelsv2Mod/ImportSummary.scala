package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSummary extends StObject {
  
  /**
    * The date and time that the import was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier that Amazon Lex assigned to the import.
    */
  var importId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the resource. When the status is Completed the resource is ready to build.
    */
  var importStatus: js.UndefOr[ImportStatus] = js.undefined
  
  /**
    * The unique identifier that Amazon Lex assigned to the imported resource.
    */
  var importedResourceId: js.UndefOr[ImportedResourceId] = js.undefined
  
  /**
    * The name that you gave the imported resource.
    */
  var importedResourceName: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of resource that was imported.
    */
  var importedResourceType: js.UndefOr[ImportResourceType] = js.undefined
  
  /**
    * The date and time that the import was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The strategy used to merge existing bot or bot locale definitions with the imported definition.
    */
  var mergeStrategy: js.UndefOr[MergeStrategy] = js.undefined
}
object ImportSummary {
  
  inline def apply(): ImportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSummary]
  }
  
  extension [Self <: ImportSummary](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setImportId(value: Id): Self = StObject.set(x, "importId", value.asInstanceOf[js.Any])
    
    inline def setImportIdUndefined: Self = StObject.set(x, "importId", js.undefined)
    
    inline def setImportStatus(value: ImportStatus): Self = StObject.set(x, "importStatus", value.asInstanceOf[js.Any])
    
    inline def setImportStatusUndefined: Self = StObject.set(x, "importStatus", js.undefined)
    
    inline def setImportedResourceId(value: ImportedResourceId): Self = StObject.set(x, "importedResourceId", value.asInstanceOf[js.Any])
    
    inline def setImportedResourceIdUndefined: Self = StObject.set(x, "importedResourceId", js.undefined)
    
    inline def setImportedResourceName(value: Name): Self = StObject.set(x, "importedResourceName", value.asInstanceOf[js.Any])
    
    inline def setImportedResourceNameUndefined: Self = StObject.set(x, "importedResourceName", js.undefined)
    
    inline def setImportedResourceType(value: ImportResourceType): Self = StObject.set(x, "importedResourceType", value.asInstanceOf[js.Any])
    
    inline def setImportedResourceTypeUndefined: Self = StObject.set(x, "importedResourceType", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setMergeStrategy(value: MergeStrategy): Self = StObject.set(x, "mergeStrategy", value.asInstanceOf[js.Any])
    
    inline def setMergeStrategyUndefined: Self = StObject.set(x, "mergeStrategy", js.undefined)
  }
}
