package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
object GetEndpointOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): GetEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointOutput]
  }
}
