package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /**
    * The entity tag is an MD5 hash of the object. ETag reflects only changes to the contents of an object, not its metadata.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
  /**
    * The name that you assign to an object. You use the object key to retrieve the object.
    */
  var Key: js.UndefOr[ObjectKey] = js.native
  /**
    * The date the Object was Last Modified
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.native
  /**
    * The owner of the object
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
  /**
    * Size in bytes of the object
    */
  var Size: js.UndefOr[typings.awsSdk.s3Mod.Size] = js.native
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectStorageClass] = js.native
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
    def setETag(value: ETag): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setKey(value: ObjectKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setLastModified(value: LastModified): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setOwner(value: Owner): Self = this.set("Owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
    @scala.inline
    def setStorageClass(value: ObjectStorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
  
}

