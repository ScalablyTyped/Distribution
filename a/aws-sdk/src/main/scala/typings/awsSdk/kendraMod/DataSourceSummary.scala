package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSummary extends StObject {
  
  /**
    * The UNIX datetime that the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The unique identifier for the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.undefined
  
  /**
    * The name of the data source.
    */
  var Name: js.UndefOr[DataSourceName] = js.undefined
  
  /**
    * The status of the data source. When the status is ATIVE the data source is ready to use.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.undefined
  
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.undefined
  
  /**
    * The UNIX datetime that the data source was lasted updated. 
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.undefined
}
object DataSourceSummary {
  
  inline def apply(): DataSourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSummary]
  }
  
  extension [Self <: DataSourceSummary](x: Self) {
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
