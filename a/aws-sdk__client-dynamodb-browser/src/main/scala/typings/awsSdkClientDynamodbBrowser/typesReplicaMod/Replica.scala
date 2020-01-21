package typings.awsSdkClientDynamodbBrowser.typesReplicaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Replica extends js.Object {
  /**
    * <p>The region where the replica needs to be created.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}

object Replica {
  @scala.inline
  def apply(RegionName: String = null): Replica = {
    val __obj = js.Dynamic.literal()
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replica]
  }
}

