package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotCopyGrantMessage extends js.Object {
  /**
    * The unique identifier of the customer master key (CMK) to which to grant Amazon Redshift permission. If no key is specified, the default key is used.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The name of the snapshot copy grant. This name must be unique in the region for the AWS account. Constraints:   Must contain from 1 to 63 alphanumeric characters or hyphens.   Alphabetic characters must be lowercase.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for all clusters within an AWS account.  
    */
  var SnapshotCopyGrantName: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateSnapshotCopyGrantMessage {
  @scala.inline
  def apply(SnapshotCopyGrantName: String): CreateSnapshotCopyGrantMessage = {
    val __obj = js.Dynamic.literal(SnapshotCopyGrantName = SnapshotCopyGrantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotCopyGrantMessage]
  }
  @scala.inline
  implicit class CreateSnapshotCopyGrantMessageOps[Self <: CreateSnapshotCopyGrantMessage] (val x: Self) extends AnyVal {
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
    def setSnapshotCopyGrantName(value: String): Self = this.set("SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

