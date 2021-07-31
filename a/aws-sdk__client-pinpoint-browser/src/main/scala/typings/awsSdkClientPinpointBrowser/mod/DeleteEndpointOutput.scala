package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
object DeleteEndpointOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): DeleteEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointOutput]
  }
}
