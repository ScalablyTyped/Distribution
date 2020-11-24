package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageScanningConfiguration extends js.Object {
  
  /**
    * The setting that determines whether images are scanned after being pushed to a repository. If set to true, images will be scanned after being pushed. If this parameter is not specified, it will default to false and images will not be scanned unless a scan is manually started with the StartImageScan API.
    */
  var scanOnPush: js.UndefOr[ScanOnPushFlag] = js.native
}
object ImageScanningConfiguration {
  
  @scala.inline
  def apply(): ImageScanningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanningConfiguration]
  }
  
  @scala.inline
  implicit class ImageScanningConfigurationOps[Self <: ImageScanningConfiguration] (val x: Self) extends AnyVal {
    
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
    def setScanOnPush(value: ScanOnPushFlag): Self = this.set("scanOnPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanOnPush: Self = this.set("scanOnPush", js.undefined)
  }
}
