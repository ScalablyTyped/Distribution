package typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreReplicaDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReplicaDescription extends js.Object {
  /**
    * <p>The name of the region.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}

object _ReplicaDescription {
  @scala.inline
  def apply(RegionName: String = null): _ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ReplicaDescription]
  }
}

