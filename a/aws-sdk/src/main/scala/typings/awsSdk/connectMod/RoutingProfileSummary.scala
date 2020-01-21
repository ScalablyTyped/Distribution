package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingProfileSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the routing profile.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the routing profile.
    */
  var Id: js.UndefOr[RoutingProfileId] = js.native
  /**
    * The name of the routing profile.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.native
}

object RoutingProfileSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: RoutingProfileId = null, Name: RoutingProfileName = null): RoutingProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingProfileSummary]
  }
}

