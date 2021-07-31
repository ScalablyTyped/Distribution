package typings.awsSdkClientPinpointBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
object DeleteEndpointInput {
  
  @scala.inline
  def apply(ApplicationId: String, EndpointId: String): DeleteEndpointInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointInput]
  }
}
