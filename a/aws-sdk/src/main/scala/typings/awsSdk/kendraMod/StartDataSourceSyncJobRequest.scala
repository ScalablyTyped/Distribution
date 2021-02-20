package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDataSourceSyncJobRequest extends StObject {
  
  /**
    * The identifier of the data source to synchronize.
    */
  var Id: DataSourceId = js.native
  
  /**
    * The identifier of the index that contains the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId = js.native
}
object StartDataSourceSyncJobRequest {
  
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): StartDataSourceSyncJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDataSourceSyncJobRequest]
  }
  
  @scala.inline
  implicit class StartDataSourceSyncJobRequestMutableBuilder[Self <: StartDataSourceSyncJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
