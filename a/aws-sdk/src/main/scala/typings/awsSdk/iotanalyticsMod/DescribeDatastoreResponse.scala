package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatastoreResponse extends StObject {
  
  /**
    * Information about the data store.
    */
  var datastore: js.UndefOr[Datastore] = js.native
  
  /**
    * Additional statistical information about the data store. Included if the includeStatistics parameter is set to true in the request.
    */
  var statistics: js.UndefOr[DatastoreStatistics] = js.native
}
object DescribeDatastoreResponse {
  
  @scala.inline
  def apply(): DescribeDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatastoreResponse]
  }
  
  @scala.inline
  implicit class DescribeDatastoreResponseMutableBuilder[Self <: DescribeDatastoreResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatastoreUndefined: Self = StObject.set(x, "datastore", js.undefined)
    
    @scala.inline
    def setStatistics(value: DatastoreStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
