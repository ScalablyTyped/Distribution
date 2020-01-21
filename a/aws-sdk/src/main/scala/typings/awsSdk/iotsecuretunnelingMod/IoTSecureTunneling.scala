package typings.awsSdk.iotsecuretunnelingMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.std.String
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTSecureTunneling extends String {
  var config: ConfigBase with ClientConfiguration = js.native
  /**
    * Closes a tunnel identified by the unique tunnel id. When a CloseTunnel request is received, we close the WebSocket connections between the client and proxy server so no data can be transmitted.
    */
  def closeTunnel(): Request[CloseTunnelResponse, AWSError] = js.native
  def closeTunnel(callback: js.Function2[/* err */ AWSError, /* data */ CloseTunnelResponse, Unit]): Request[CloseTunnelResponse, AWSError] = js.native
  /**
    * Closes a tunnel identified by the unique tunnel id. When a CloseTunnel request is received, we close the WebSocket connections between the client and proxy server so no data can be transmitted.
    */
  def closeTunnel(params: CloseTunnelRequest): Request[CloseTunnelResponse, AWSError] = js.native
  def closeTunnel(
    params: CloseTunnelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloseTunnelResponse, Unit]
  ): Request[CloseTunnelResponse, AWSError] = js.native
  /**
    * Gets information about a tunnel identified by the unique tunnel id.
    */
  def describeTunnel(): Request[DescribeTunnelResponse, AWSError] = js.native
  def describeTunnel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTunnelResponse, Unit]): Request[DescribeTunnelResponse, AWSError] = js.native
  /**
    * Gets information about a tunnel identified by the unique tunnel id.
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
    * List all tunnels for an AWS account. Tunnels are listed by creation time in descending order, newer tunnels will be listed before older tunnels.
    */
  def listTunnels(): Request[ListTunnelsResponse, AWSError] = js.native
  def listTunnels(callback: js.Function2[/* err */ AWSError, /* data */ ListTunnelsResponse, Unit]): Request[ListTunnelsResponse, AWSError] = js.native
  /**
    * List all tunnels for an AWS account. Tunnels are listed by creation time in descending order, newer tunnels will be listed before older tunnels.
    */
  def listTunnels(params: ListTunnelsRequest): Request[ListTunnelsResponse, AWSError] = js.native
  def listTunnels(
    params: ListTunnelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTunnelsResponse, Unit]
  ): Request[ListTunnelsResponse, AWSError] = js.native
  /**
    * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the AWS IoT Secure Tunneling proxy server. .
    */
  def openTunnel(): Request[OpenTunnelResponse, AWSError] = js.native
  def openTunnel(callback: js.Function2[/* err */ AWSError, /* data */ OpenTunnelResponse, Unit]): Request[OpenTunnelResponse, AWSError] = js.native
  /**
    * Creates a new tunnel, and returns two client access tokens for clients to use to connect to the AWS IoT Secure Tunneling proxy server. .
    */
  def openTunnel(params: OpenTunnelRequest): Request[OpenTunnelResponse, AWSError] = js.native
  def openTunnel(
    params: OpenTunnelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ OpenTunnelResponse, Unit]
  ): Request[OpenTunnelResponse, AWSError] = js.native
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

