package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupPendingModifiedValues extends js.Object {
  /**
    * The auth token status
    */
  var AuthTokenStatus: js.UndefOr[AuthTokenUpdateStatus] = js.native
  /**
    * Indicates the status of automatic failover for this Redis replication group.
    */
  var AutomaticFailoverStatus: js.UndefOr[PendingAutomaticFailoverStatus] = js.native
  /**
    * The primary cluster ID that is applied immediately (if --apply-immediately was specified), or during the next maintenance window.
    */
  var PrimaryClusterId: js.UndefOr[String] = js.native
  /**
    * The status of an online resharding operation.
    */
  var Resharding: js.UndefOr[ReshardingStatus] = js.native
}

object ReplicationGroupPendingModifiedValues {
  @scala.inline
  def apply(): ReplicationGroupPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationGroupPendingModifiedValues]
  }
  @scala.inline
  implicit class ReplicationGroupPendingModifiedValuesOps[Self <: ReplicationGroupPendingModifiedValues] (val x: Self) extends AnyVal {
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
    def setAuthTokenStatus(value: AuthTokenUpdateStatus): Self = this.set("AuthTokenStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthTokenStatus: Self = this.set("AuthTokenStatus", js.undefined)
    @scala.inline
    def setAutomaticFailoverStatus(value: PendingAutomaticFailoverStatus): Self = this.set("AutomaticFailoverStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticFailoverStatus: Self = this.set("AutomaticFailoverStatus", js.undefined)
    @scala.inline
    def setPrimaryClusterId(value: String): Self = this.set("PrimaryClusterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryClusterId: Self = this.set("PrimaryClusterId", js.undefined)
    @scala.inline
    def setResharding(value: ReshardingStatus): Self = this.set("Resharding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResharding: Self = this.set("Resharding", js.undefined)
  }
  
}

