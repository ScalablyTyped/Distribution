package typings.awsSdk.iotsecuretunnelingMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTSecureTunneling
  extends StObject
     with String {
  
  /**
    * Closes a tunnel identified by the unique tunnel id. When a CloseTunnel request is received, we close the WebSocket connections between the client and proxy server so no data can be transmitted. Requires permission to access the CloseTunnel action.
    */
  def closeTunnel(): Request[CloseTunnelResponse, AWSError] = js.native
  def closeTunnel(callback: js.Function2[/* err */ AWSError, /* data */ CloseTunnelResponse, Unit]): Request[CloseTunnelResponse, AWSError] = js.native
  /**
    * Closes a tunnel identified by the unique tunnel id. When a CloseTunnel request is received, we close the WebSocket connections between the client and proxy server so no data can be transmitted. Requires permission to access the CloseTunnel action.
    */
  def closeTunnel(params: CloseTunnelRequest): Request[CloseTunnelResponse, AWSError] = js.native
  def closeTunnel(
    params: CloseTunnelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloseTunnelResponse, Unit]
  ): Request[CloseTunnelResponse, AWSError] = js.native
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Gets information about a tunnel identified by the unique tunnel id. Requires permission to access the DescribeTunnel action.
    */
  def describeTunnel(): Request[DescribeTunnelResponse, AWSError] = js.native
  def describeTunnel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTunnelResponse, Unit]): Request[DescribeTunnelResponse, AWSError] = js.native
  /**
    * Gets information about a tunnel identified by the unique tunnel id. Requires permission to access the DescribeTunnel action.
    */
  def describeTunnel(params: DescribeTunnelRequest): Request[DescribeTunnelResponse, AWSError] = js.native
  def describeTunnel(
    params: DescribeTunnelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTunnelResponse, Unit]
  ): Request[DescribeTunnelResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * List all tunnels for an Amazon Web Services account. Tunnels are listed by creation time in descending order, newer tunnels will be listed before older tunnels. Requires permission to access the ListTunnels action.
    */
  def listTunnels(): Request[ListTunnelsResponse, AWSError] = js.native
  def listTunnels(callback: js.Function2[/* err */ AWSError, /* data */ ListTunnelsResponse, Unit]): Request[ListTunnelsResponse, AWSError] = js.native
  /**
    * List all tunnels for an Amazon Web Services account. Tunnels are listed by creation time in descending order, newer tunnels will be listed before older tunnels. Requires permission to access the ListTunnels action.
    */
  def listTunnels(params: ListTunnelsRequest): Request[ListTunnelsResponse, AWSError] = js.native
  def listTunnels(
    params: ListTunnelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTunnelsResponse, Unit]
  ): Request[ListTunnelsResponse, AWSError] = js.native
  
  /**
    * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the IoT Secure Tunneling proxy server. Requires permission to access the OpenTunnel action.
    */
  def openTunnel(): Request[OpenTunnelResponse, AWSError] = js.native
  def openTunnel(callback: js.Function2[/* err */ AWSError, /* data */ OpenTunnelResponse, Unit]): Request[OpenTunnelResponse, AWSError] = js.native
  /**
    * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the IoT Secure Tunneling proxy server. Requires permission to access the OpenTunnel action.
    */
  def openTunnel(params: OpenTunnelRequest): Request[OpenTunnelResponse, AWSError] = js.native
  def openTunnel(
    params: OpenTunnelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ OpenTunnelResponse, Unit]
  ): Request[OpenTunnelResponse, AWSError] = js.native
  
  /**
    * Revokes the current client access token (CAT) and returns new CAT for clients to use when reconnecting to secure tunneling to access the same tunnel. Requires permission to access the RotateTunnelAccessToken action.  Rotating the CAT doesn't extend the tunnel duration. For example, say the tunnel duration is 12 hours and the tunnel has already been open for 4 hours. When you rotate the access tokens, the new tokens that are generated can only be used for the remaining 8 hours. 
    */
  def rotateTunnelAccessToken(): Request[RotateTunnelAccessTokenResponse, AWSError] = js.native
  def rotateTunnelAccessToken(callback: js.Function2[/* err */ AWSError, /* data */ RotateTunnelAccessTokenResponse, Unit]): Request[RotateTunnelAccessTokenResponse, AWSError] = js.native
  /**
    * Revokes the current client access token (CAT) and returns new CAT for clients to use when reconnecting to secure tunneling to access the same tunnel. Requires permission to access the RotateTunnelAccessToken action.  Rotating the CAT doesn't extend the tunnel duration. For example, say the tunnel duration is 12 hours and the tunnel has already been open for 4 hours. When you rotate the access tokens, the new tokens that are generated can only be used for the remaining 8 hours. 
    */
  def rotateTunnelAccessToken(params: RotateTunnelAccessTokenRequest): Request[RotateTunnelAccessTokenResponse, AWSError] = js.native
  def rotateTunnelAccessToken(
    params: RotateTunnelAccessTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RotateTunnelAccessTokenResponse, Unit]
  ): Request[RotateTunnelAccessTokenResponse, AWSError] = js.native
  
  /**
    * A resource tag.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * A resource tag.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
