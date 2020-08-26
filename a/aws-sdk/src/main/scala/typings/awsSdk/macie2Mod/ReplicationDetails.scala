package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationDetails extends js.Object {
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to any destination.
    */
  var replicated: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the bucket is configured to replicate one or more objects to an AWS account that isn't part of the Amazon Macie organization.
    */
  var replicatedExternally: js.UndefOr[boolean] = js.native
  /**
    * An array of AWS account IDs, one for each AWS account that the bucket is configured to replicate one or more objects to.
    */
  var replicationAccounts: js.UndefOr[listOfString] = js.native
}

object ReplicationDetails {
  @scala.inline
  def apply(): ReplicationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationDetails]
  }
  @scala.inline
  implicit class ReplicationDetailsOps[Self <: ReplicationDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicated(value: boolean): Self = this.set("replicated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicated: Self = this.set("replicated", js.undefined)
    @scala.inline
    def setReplicatedExternally(value: boolean): Self = this.set("replicatedExternally", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicatedExternally: Self = this.set("replicatedExternally", js.undefined)
    @scala.inline
    def setReplicationAccountsVarargs(value: string*): Self = this.set("replicationAccounts", js.Array(value :_*))
    @scala.inline
    def setReplicationAccounts(value: listOfString): Self = this.set("replicationAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationAccounts: Self = this.set("replicationAccounts", js.undefined)
  }
  
}

