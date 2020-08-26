package typings.awsSdkClientS3Node.typesDeleteMarkerEntryMod

import typings.awsSdkClientS3Node.typesOwnerMod.Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMarkerEntry extends js.Object {
  /**
    * <p>Specifies whether the object is (true) or is not (false) the latest version of an object.</p>
    */
  var IsLatest: js.UndefOr[Boolean] = js.native
  /**
    * <p>The object key.</p>
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * <p>Date and time the object was last modified.</p>
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typings.awsSdkClientS3Node.typesOwnerMod.Owner] = js.native
  /**
    * <p>Version ID of an object.</p>
    */
  var VersionId: js.UndefOr[String] = js.native
}

object DeleteMarkerEntry {
  @scala.inline
  def apply(): DeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerEntry]
  }
  @scala.inline
  implicit class DeleteMarkerEntryOps[Self <: DeleteMarkerEntry] (val x: Self) extends AnyVal {
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
    def setIsLatest(value: Boolean): Self = this.set("IsLatest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLatest: Self = this.set("IsLatest", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setLastModified(value: Date | String | Double): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setVersionId(value: String): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

