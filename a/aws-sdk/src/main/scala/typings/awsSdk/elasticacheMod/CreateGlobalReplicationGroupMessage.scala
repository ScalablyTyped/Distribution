package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalReplicationGroupMessage extends js.Object {
  /**
    * Provides details of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  /**
    * The suffix name of a Global Datastore. The suffix guarantees uniqueness of the Global Datastore name across multiple regions.
    */
  var GlobalReplicationGroupIdSuffix: String = js.native
  /**
    * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
    */
  var PrimaryReplicationGroupId: String = js.native
}

object CreateGlobalReplicationGroupMessage {
  @scala.inline
  def apply(
    GlobalReplicationGroupIdSuffix: String,
    PrimaryReplicationGroupId: String,
    GlobalReplicationGroupDescription: String = null
  ): CreateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupIdSuffix = GlobalReplicationGroupIdSuffix.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    if (GlobalReplicationGroupDescription != null) __obj.updateDynamic("GlobalReplicationGroupDescription")(GlobalReplicationGroupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalReplicationGroupMessage]
  }
}

