package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopDataSourceSyncJobRequest extends StObject {
  
  /**
    * The identifier of the data source for which to stop the synchronization jobs.
    */
  var Id: DataSourceId = js.native
  
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}
object StopDataSourceSyncJobRequest {
  
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): StopDataSourceSyncJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDataSourceSyncJobRequest]
  }
  
  @scala.inline
  implicit class StopDataSourceSyncJobRequestMutableBuilder[Self <: StopDataSourceSyncJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
