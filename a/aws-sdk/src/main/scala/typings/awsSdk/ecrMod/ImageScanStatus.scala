package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageScanStatus extends js.Object {
  
  /**
    * The description of the image scan status.
    */
  var description: js.UndefOr[ScanStatusDescription] = js.native
  
  /**
    * The current state of an image scan.
    */
  var status: js.UndefOr[ScanStatus] = js.native
}
object ImageScanStatus {
  
  @scala.inline
  def apply(): ImageScanStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanStatus]
  }
  
  @scala.inline
  implicit class ImageScanStatusOps[Self <: ImageScanStatus] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: ScanStatusDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setStatus(value: ScanStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
