package typings.awsSdkClientS3Browser.typesAbortIncompleteMultipartUploadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortIncompleteMultipartUpload extends js.Object {
  
  /**
    * <p>Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.</p>
    */
  var DaysAfterInitiation: js.UndefOr[Double] = js.native
}
object AbortIncompleteMultipartUpload {
  
  @scala.inline
  def apply(): AbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbortIncompleteMultipartUpload]
  }
  
  @scala.inline
  implicit class AbortIncompleteMultipartUploadOps[Self <: AbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
    
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
    def setDaysAfterInitiation(value: Double): Self = this.set("DaysAfterInitiation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysAfterInitiation: Self = this.set("DaysAfterInitiation", js.undefined)
  }
}
