package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object extends js.Object {
  
  /**
    * The entity tag is a hash of the object. The ETag reflects changes only to the contents of an object, not its metadata. The ETag may or may not be an MD5 digest of the object data. Whether or not it is depends on how the object was created and how it is encrypted as described below:   Objects created by the PUT Object, POST Object, or Copy operation, or through the AWS Management Console, and are encrypted by SSE-S3 or plaintext, have ETags that are an MD5 digest of their object data.   Objects created by the PUT Object, POST Object, or Copy operation, or through the AWS Management Console, and are encrypted by SSE-C or SSE-KMS, have ETags that are not an MD5 digest of their object data.   If an object is created by either the Multipart Upload or Part Copy operation, the ETag is not an MD5 digest, regardless of the method of encryption.  
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
