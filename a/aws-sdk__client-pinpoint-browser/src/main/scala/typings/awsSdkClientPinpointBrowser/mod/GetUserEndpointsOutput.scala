package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserEndpointsOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
object GetUserEndpointsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): GetUserEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsOutput]
  }
}
