package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCopyGrant extends js.Object {
  /**
    * The unique identifier of the customer master key (CMK) in AWS KMS to which Amazon Redshift is granted permission.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object SnapshotCopyGrant {
  @scala.inline
  def apply(KmsKeyId: String = null, SnapshotCopyGrantName: String = null, Tags: TagList = null): SnapshotCopyGrant = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (SnapshotCopyGrantName != null) __obj.updateDynamic("SnapshotCopyGrantName")(SnapshotCopyGrantName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyGrant]
  }
}

