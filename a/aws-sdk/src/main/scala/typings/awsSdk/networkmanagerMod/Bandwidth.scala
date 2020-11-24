package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bandwidth extends js.Object {
  
  /**
    * Download speed in Mbps.
    */
  var DownloadSpeed: js.UndefOr[Integer] = js.native
  
  /**
    * Upload speed in Mbps.
    */
  var UploadSpeed: js.UndefOr[Integer] = js.native
}
object Bandwidth {
  
  @scala.inline
  def apply(): Bandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bandwidth]
  }
  
  @scala.inline
  implicit class BandwidthOps[Self <: Bandwidth] (val x: Self) extends AnyVal {
    
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
    def setDownloadSpeed(value: Integer): Self = this.set("DownloadSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadSpeed: Self = this.set("DownloadSpeed", js.undefined)
    
    @scala.inline
    def setUploadSpeed(value: Integer): Self = this.set("UploadSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadSpeed: Self = this.set("UploadSpeed", js.undefined)
  }
}
