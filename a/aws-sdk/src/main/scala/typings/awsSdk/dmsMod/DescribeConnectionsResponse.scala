package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionsResponse extends StObject {
  
  /**
    * A description of the connections.
    */
  var Connections: js.UndefOr[ConnectionList] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object DescribeConnectionsResponse {
  
  @scala.inline
  def apply(): DescribeConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionsResponse]
  }
  
  @scala.inline
  implicit class DescribeConnectionsResponseMutableBuilder[Self <: DescribeConnectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnections(value: ConnectionList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    @scala.inline
    def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "Connections", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
