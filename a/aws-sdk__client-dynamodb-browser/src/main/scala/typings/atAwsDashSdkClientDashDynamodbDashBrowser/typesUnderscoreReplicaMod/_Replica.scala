package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreReplicaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Replica extends js.Object {
  /**
    * <p>The region where the replica needs to be created.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}

object _Replica {
  @scala.inline
  def apply(RegionName: String = null): _Replica = {
    val __obj = js.Dynamic.literal()
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Replica]
  }
}

