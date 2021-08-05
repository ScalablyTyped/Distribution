package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEndpointRequestMod.EndpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
object UpdateEndpointInput {
  
  inline def apply(ApplicationId: String, EndpointId: String, EndpointRequest: EndpointRequest): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointInput]
  }
}
