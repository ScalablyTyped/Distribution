package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverEndpointRequest extends js.Object {
  /**
    * The ID of the resolver endpoint that you want to get information about.
    */
  var ResolverEndpointId: ResourceId = js.native
}

object GetResolverEndpointRequest {
  @scala.inline
  def apply(ResolverEndpointId: ResourceId): GetResolverEndpointRequest = {
    val __obj = js.Dynamic.literal(ResolverEndpointId = ResolverEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverEndpointRequest]
  }
}

