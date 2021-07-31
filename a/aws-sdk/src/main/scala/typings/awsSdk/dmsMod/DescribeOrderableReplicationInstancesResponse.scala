package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrderableReplicationInstancesResponse extends StObject {
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The order-able replication instances available.
    */
  var OrderableReplicationInstances: js.UndefOr[OrderableReplicationInstanceList] = js.undefined
}
object DescribeOrderableReplicationInstancesResponse {
  
  @scala.inline
  def apply(): DescribeOrderableReplicationInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrderableReplicationInstancesResponse]
  }
  
  @scala.inline
  implicit class DescribeOrderableReplicationInstancesResponseMutableBuilder[Self <: DescribeOrderableReplicationInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setOrderableReplicationInstances(value: OrderableReplicationInstanceList): Self = StObject.set(x, "OrderableReplicationInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderableReplicationInstancesUndefined: Self = StObject.set(x, "OrderableReplicationInstances", js.undefined)
    
    @scala.inline
    def setOrderableReplicationInstancesVarargs(value: OrderableReplicationInstance*): Self = StObject.set(x, "OrderableReplicationInstances", js.Array(value :_*))
  }
}
