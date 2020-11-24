package typings.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutObjectResponse extends js.Object {
  
  /**
    * The SHA256 digest of the object that is persisted.
    */
  var ContentSHA256: js.UndefOr[SHA256Hash] = js.native
  
  /**
    * Unique identifier of the object in the container.
    */
  var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
  
  /**
    * The storage class where the object was persisted. The class should be “Temporal”.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.mediastoredataMod.StorageClass] = js.native
}
object PutObjectResponse {
  
  @scala.inline
  def apply(): PutObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectResponse]
  }
  
  @scala.inline
  implicit class PutObjectResponseOps[Self <: PutObjectResponse] (val x: Self) extends AnyVal {
    
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
    def setContentSHA256(value: SHA256Hash): Self = this.set("ContentSHA256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSHA256: Self = this.set("ContentSHA256", js.undefined)
    
    @scala.inline
    def setETag(value: ETag): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    
    @scala.inline
    def setStorageClass(value: StorageClass): Self = this.set("StorageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageClass: Self = this.set("StorageClass", js.undefined)
  }
}
