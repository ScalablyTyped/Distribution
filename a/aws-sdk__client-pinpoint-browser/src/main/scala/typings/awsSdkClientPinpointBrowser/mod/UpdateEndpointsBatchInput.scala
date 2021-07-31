package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEndpointBatchRequestMod.EndpointBatchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointsBatchInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
object UpdateEndpointsBatchInput {
  
  @scala.inline
  def apply(ApplicationId: String, EndpointBatchRequest: EndpointBatchRequest): UpdateEndpointsBatchInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointBatchRequest = EndpointBatchRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointsBatchInput]
  }
}
