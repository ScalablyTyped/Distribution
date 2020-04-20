package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailoverGlobalReplicationGroupMessage extends js.Object {
  /**
    * The name of the Global Datastore
    */
  var GlobalReplicationGroupId: String = js.native
  /**
    * The AWS region of the primary cluster of the Global Datastore
    */
  var PrimaryRegion: String = js.native
  /**
    * The name of the primary replication group
    */
  var PrimaryReplicationGroupId: String = js.native
}

object FailoverGlobalReplicationGroupMessage {
  @scala.inline
  def apply(GlobalReplicationGroupId: String, PrimaryRegion: String, PrimaryReplicationGroupId: String): FailoverGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], PrimaryRegion = PrimaryRegion.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverGlobalReplicationGroupMessage]
  }
}

