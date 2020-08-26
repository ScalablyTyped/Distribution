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
  def apply(GlobalReplicationGroupIdSuffix: String, PrimaryReplicationGroupId: String): CreateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupIdSuffix = GlobalReplicationGroupIdSuffix.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalReplicationGroupMessage]
  }
  @scala.inline
  implicit class CreateGlobalReplicationGroupMessageOps[Self <: CreateGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalReplicationGroupIdSuffix(value: String): Self = this.set("GlobalReplicationGroupIdSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryReplicationGroupId(value: String): Self = this.set("PrimaryReplicationGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalReplicationGroupDescription(value: String): Self = this.set("GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalReplicationGroupDescription: Self = this.set("GlobalReplicationGroupDescription", js.undefined)
  }
  
}

