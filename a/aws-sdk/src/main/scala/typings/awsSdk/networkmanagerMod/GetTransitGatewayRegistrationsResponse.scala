package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTransitGatewayRegistrationsResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The transit gateway registrations.
    */
  var TransitGatewayRegistrations: js.UndefOr[TransitGatewayRegistrationList] = js.native
}
object GetTransitGatewayRegistrationsResponse {
  
  @scala.inline
  def apply(): GetTransitGatewayRegistrationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayRegistrationsResponse]
  }
  
  @scala.inline
  implicit class GetTransitGatewayRegistrationsResponseMutableBuilder[Self <: GetTransitGatewayRegistrationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTransitGatewayRegistrations(value: TransitGatewayRegistrationList): Self = StObject.set(x, "TransitGatewayRegistrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayRegistrationsUndefined: Self = StObject.set(x, "TransitGatewayRegistrations", js.undefined)
    
    @scala.inline
    def setTransitGatewayRegistrationsVarargs(value: TransitGatewayRegistration*): Self = StObject.set(x, "TransitGatewayRegistrations", js.Array(value :_*))
  }
}
