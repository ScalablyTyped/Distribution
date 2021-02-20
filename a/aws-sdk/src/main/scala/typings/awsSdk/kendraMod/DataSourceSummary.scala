package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceSummary extends StObject {
  
  /**
    * The UNIX datetime that the data source was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The unique identifier for the data source.
    */
  var Id: js.UndefOr[DataSourceId] = js.native
  
  /**
    * The name of the data source.
    */
  var Name: js.UndefOr[DataSourceName] = js.native
  
  /**
    * The status of the data source. When the status is ATIVE the data source is ready to use.
    */
  var Status: js.UndefOr[DataSourceStatus] = js.native
  
  /**
    * The type of the data source.
    */
  var Type: js.UndefOr[DataSourceType] = js.native
  
  /**
    * The UNIX datetime that the data source was lasted updated. 
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}
object DataSourceSummary {
  
  @scala.inline
  def apply(): DataSourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSummary]
  }
  
  @scala.inline
  implicit class DataSourceSummaryMutableBuilder[Self <: DataSourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: DataSourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: DataSourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
