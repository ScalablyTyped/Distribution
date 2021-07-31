package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointDetails extends StObject {
  
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.undefined
  
  /**
    * Endpoint security details.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.undefined
}
object EndpointDetails {
  
  @scala.inline
  def apply(): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDetails]
  }
  
  @scala.inline
  implicit class EndpointDetailsMutableBuilder[Self <: EndpointDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: DataflowEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setSecurityDetails(value: SecurityDetails): Self = StObject.set(x, "securityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDetailsUndefined: Self = StObject.set(x, "securityDetails", js.undefined)
  }
}
