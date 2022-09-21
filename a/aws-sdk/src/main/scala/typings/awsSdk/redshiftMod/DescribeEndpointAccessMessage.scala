package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointAccessMessage extends StObject {
  
  /**
    * The cluster identifier associated with the described endpoint.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the endpoint to be described.
    */
  var EndpointName: js.UndefOr[String] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeEndpointAccess request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a Marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the cluster.
    */
  var ResourceOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The virtual private cloud (VPC) identifier with access to the cluster.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DescribeEndpointAccessMessage {
  
  inline def apply(): DescribeEndpointAccessMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointAccessMessage]
  }
  
  extension [Self <: DescribeEndpointAccessMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setResourceOwner(value: String): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
