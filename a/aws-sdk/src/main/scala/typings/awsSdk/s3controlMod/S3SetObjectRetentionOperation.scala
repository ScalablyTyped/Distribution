package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3SetObjectRetentionOperation extends js.Object {
  /**
    * Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.
    */
  var BypassGovernanceRetention: js.UndefOr[Boolean] = js.native
  /**
    * Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.
    */
  var Retention: S3Retention = js.native
}

object S3SetObjectRetentionOperation {
  @scala.inline
  def apply(Retention: S3Retention, BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined): S3SetObjectRetentionOperation = {
    val __obj = js.Dynamic.literal(Retention = Retention.asInstanceOf[js.Any])
    if (!js.isUndefined(BypassGovernanceRetention)) __obj.updateDynamic("BypassGovernanceRetention")(BypassGovernanceRetention.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectRetentionOperation]
  }
}

