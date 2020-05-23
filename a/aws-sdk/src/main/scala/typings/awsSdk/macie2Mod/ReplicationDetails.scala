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
  def apply(
    replicated: js.UndefOr[boolean] = js.undefined,
    replicatedExternally: js.UndefOr[boolean] = js.undefined,
    replicationAccounts: listOfString = null
  ): ReplicationDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(replicated)) __obj.updateDynamic("replicated")(replicated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replicatedExternally)) __obj.updateDynamic("replicatedExternally")(replicatedExternally.get.asInstanceOf[js.Any])
    if (replicationAccounts != null) __obj.updateDynamic("replicationAccounts")(replicationAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationDetails]
  }
}

