package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesUpdateAttributesRequestMod.UpdateAttributesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributesInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
object RemoveAttributesInput {
  
  inline def apply(ApplicationId: String, AttributeType: String, UpdateAttributesRequest: UpdateAttributesRequest): RemoveAttributesInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], AttributeType = AttributeType.asInstanceOf[js.Any], UpdateAttributesRequest = UpdateAttributesRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesInput]
  }
}
