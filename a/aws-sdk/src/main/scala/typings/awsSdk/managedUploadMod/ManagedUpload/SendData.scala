package typings.awsSdk.managedUploadMod.ManagedUpload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendData extends js.Object {
  
  /**
    * Bucket to which the object was uploaded.
    */
  var Bucket: String = js.native
  
  /**
    * ETag of the uploaded object.
    */
  var ETag: String = js.native
  
  /**
    * Key to which the object was uploaded.
    */
  var Key: String = js.native
  
  /**
    * URL of the uploaded object.
    */
  var Location: String = js.native
}
object SendData {
  
  @scala.inline
  def apply(Bucket: String, ETag: String, Key: String, Location: String): SendData = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ETag = ETag.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendData]
  }
  
  @scala.inline
  implicit class SendDataOps[Self <: SendData] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("Location", value.asInstanceOf[js.Any])
  }
}
