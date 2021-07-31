package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataSourceRequest extends StObject {
  
  /**
    * The unique identifier of the data source to delete.
    */
  var Id: DataSourceId
  
  /**
    * The unique identifier of the index associated with the data source.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
}
object DeleteDataSourceRequest {
  
  @scala.inline
  def apply(Id: DataSourceId, IndexId: IndexId): DeleteDataSourceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceRequest]
  }
  
  @scala.inline
  implicit class DeleteDataSourceRequestMutableBuilder[Self <: DeleteDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
