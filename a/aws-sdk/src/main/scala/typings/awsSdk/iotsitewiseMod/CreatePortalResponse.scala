package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePortalResponse extends js.Object {
  /**
    * The ARN of the portal, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:portal/${PortalId} 
    */
  var portalArn: ARN = js.native
  /**
    * The ID of the created portal.
    */
  var portalId: ID = js.native
  /**
    * The public URL for the AWS IoT SiteWise Monitor portal.
    */
  var portalStartUrl: Url = js.native
  /**
    * The status of the portal, which contains a state (CREATING after successfully calling this operation) and any error message.
    */
  var portalStatus: PortalStatus = js.native
  /**
    * The associated AWS SSO application Id.
    */
  var ssoApplicationId: SSOApplicationId = js.native
}

object CreatePortalResponse {
  @scala.inline
  def apply(
    portalArn: ARN,
    portalId: ID,
    portalStartUrl: Url,
    portalStatus: PortalStatus,
    ssoApplicationId: SSOApplicationId
  ): CreatePortalResponse = {
    val __obj = js.Dynamic.literal(portalArn = portalArn.asInstanceOf[js.Any], portalId = portalId.asInstanceOf[js.Any], portalStartUrl = portalStartUrl.asInstanceOf[js.Any], portalStatus = portalStatus.asInstanceOf[js.Any], ssoApplicationId = ssoApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePortalResponse]
  }
}

