package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the endpoint.
    */
  var VpcEndpoint: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpoint] = js.undefined
}
object CreateVpcEndpointResult {
  
  inline def apply(): CreateVpcEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointResult]
  }
  
  extension [Self <: CreateVpcEndpointResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointUndefined: Self = StObject.set(x, "VpcEndpoint", js.undefined)
  }
}
