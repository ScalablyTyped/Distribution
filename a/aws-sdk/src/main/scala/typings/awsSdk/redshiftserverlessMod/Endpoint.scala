package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * The DNS address of the VPC endpoint.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * The port that Amazon Redshift Serverless listens on.
    */
  var port: js.UndefOr[Integer] = js.undefined
  
  /**
    * An array of VpcEndpoint objects.
    */
  var vpcEndpoints: js.UndefOr[VpcEndpointList] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setVpcEndpoints(value: VpcEndpointList): Self = StObject.set(x, "vpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointsUndefined: Self = StObject.set(x, "vpcEndpoints", js.undefined)
    
    inline def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = StObject.set(x, "vpcEndpoints", js.Array(value*))
  }
}
