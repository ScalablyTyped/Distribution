package typings.atAwsDashSdkRoute53DashIdDashNormalizerDashMiddleware.atAwsDashSdkRoute53DashIdDashNormalizerDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierBearer extends js.Object {
  var DelegationSetId: js.UndefOr[String] = js.undefined
  var HostedZoneId: js.UndefOr[String] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
}

object IdentifierBearer {
  @scala.inline
  def apply(DelegationSetId: String = null, HostedZoneId: String = null, Id: String = null): IdentifierBearer = {
    val __obj = js.Dynamic.literal()
    if (DelegationSetId != null) __obj.updateDynamic("DelegationSetId")(DelegationSetId.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierBearer]
  }
}

