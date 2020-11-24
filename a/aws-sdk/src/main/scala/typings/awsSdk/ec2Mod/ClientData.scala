package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientData extends js.Object {
  
  /**
    * A user-defined comment about the disk upload.
    */
  var Comment: js.UndefOr[String] = js.native
  
  /**
    * The time that the disk upload ends.
    */
  var UploadEnd: js.UndefOr[DateTime] = js.native
  
  /**
    * The size of the uploaded disk image, in GiB.
    */
  var UploadSize: js.UndefOr[Double] = js.native
  
  /**
    * The time that the disk upload starts.
    */
  var UploadStart: js.UndefOr[DateTime] = js.native
}
object ClientData {
  
  @scala.inline
  def apply(): ClientData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientData]
  }
  
  @scala.inline
  implicit class ClientDataOps[Self <: ClientData] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    
    @scala.inline
    def setUploadEnd(value: DateTime): Self = this.set("UploadEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadEnd: Self = this.set("UploadEnd", js.undefined)
    
    @scala.inline
    def setUploadSize(value: Double): Self = this.set("UploadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadSize: Self = this.set("UploadSize", js.undefined)
    
    @scala.inline
    def setUploadStart(value: DateTime): Self = this.set("UploadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadStart: Self = this.set("UploadStart", js.undefined)
  }
}
