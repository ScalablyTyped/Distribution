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
  def apply(): SnapshotCopyGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCopyGrant]
  }
  @scala.inline
  implicit class SnapshotCopyGrantOps[Self <: SnapshotCopyGrant] (val x: Self) extends AnyVal {
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
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = this.set("SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotCopyGrantName: Self = this.set("SnapshotCopyGrantName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

