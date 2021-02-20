package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVpcEndpointResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the endpoint.
    */
  var VpcEndpoint: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpoint] = js.native
}
object CreateVpcEndpointResult {
  
  @scala.inline
  def apply(): CreateVpcEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointResult]
  }
  
  @scala.inline
  implicit class CreateVpcEndpointResultMutableBuilder[Self <: CreateVpcEndpointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointUndefined: Self = StObject.set(x, "VpcEndpoint", js.undefined)
  }
}
