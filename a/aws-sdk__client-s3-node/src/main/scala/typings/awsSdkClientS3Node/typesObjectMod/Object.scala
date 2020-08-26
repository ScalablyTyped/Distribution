package typings.awsSdkClientS3Node.typesObjectMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.GLACIER
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typings.awsSdkClientS3Node.typesOwnerMod.Owner
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /**
    * _ETag shape
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.native
  /**
    * _LastModified shape
    */
  var LastModified: js.UndefOr[Date | String | Double] = js.native
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[typings.awsSdkClientS3Node.typesOwnerMod.Owner] = js.native
  /**
    * _Size shape
    */
  var Size: js.UndefOr[Double] = js.native
  /**
    * <p>The class of storage used to store the object.</p>
    */
  var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String] = js.native
}

object Object {
  @scala.inline
  def apply(): Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Object]
  }
  @scala.inline
  implicit class ObjectOps[Self <: Object] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
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
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    @scala.inline
    def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | GLACIER | STANDARD_IA | ONEZONE_IA | String): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
  
}

