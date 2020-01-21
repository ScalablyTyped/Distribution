package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateResolverEndpointIpAddressResponse extends js.Object {
  /**
    * The response to an AssociateResolverEndpointIpAddress request.
    */
  var ResolverEndpoint: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoint] = js.native
}

object AssociateResolverEndpointIpAddressResponse {
  @scala.inline
  def apply(ResolverEndpoint: ResolverEndpoint = null): AssociateResolverEndpointIpAddressResponse = {
    val __obj = js.Dynamic.literal()
    if (ResolverEndpoint != null) __obj.updateDynamic("ResolverEndpoint")(ResolverEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResolverEndpointIpAddressResponse]
  }
}

