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
  def apply(Retention: S3Retention): S3SetObjectRetentionOperation = {
    val __obj = js.Dynamic.literal(Retention = Retention.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectRetentionOperation]
  }
  @scala.inline
  implicit class S3SetObjectRetentionOperationOps[Self <: S3SetObjectRetentionOperation] (val x: Self) extends AnyVal {
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
    def setRetention(value: S3Retention): Self = this.set("Retention", value.asInstanceOf[js.Any])
    @scala.inline
    def setBypassGovernanceRetention(value: Boolean): Self = this.set("BypassGovernanceRetention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBypassGovernanceRetention: Self = this.set("BypassGovernanceRetention", js.undefined)
  }
  
}

