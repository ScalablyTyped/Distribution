package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatastoreRequest extends StObject {
  
  /**
    * The name of the data store
    */
  var datastoreName: DatastoreName = js.native
  
  /**
    * If true, additional statistical information about the data store is included in the response. This feature cannot be used with a data store whose S3 storage is customer-managed.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.native
}
object DescribeDatastoreRequest {
  
  @scala.inline
  def apply(datastoreName: DatastoreName): DescribeDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatastoreRequest]
  }
  
  @scala.inline
  implicit class DescribeDatastoreRequestMutableBuilder[Self <: DescribeDatastoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatastoreName(value: DatastoreName): Self = StObject.set(x, "datastoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStatistics(value: IncludeStatisticsFlag): Self = StObject.set(x, "includeStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeStatisticsUndefined: Self = StObject.set(x, "includeStatistics", js.undefined)
  }
}
