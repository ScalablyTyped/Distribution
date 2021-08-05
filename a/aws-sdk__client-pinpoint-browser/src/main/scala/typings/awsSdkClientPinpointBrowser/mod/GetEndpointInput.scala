package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
object GetEndpointInput {
  
  inline def apply(ApplicationId: String, EndpointId: String): GetEndpointInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointInput]
  }
}
