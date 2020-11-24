package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportBundleResult extends js.Object {
  
  /**
    *  URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app with the AWS resources created by the AWS Mobile Hub project. 
    */
  var downloadUrl: js.UndefOr[DownloadUrl] = js.native
}
object ExportBundleResult {
  
  @scala.inline
  def apply(): ExportBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBundleResult]
  }
  
  @scala.inline
  implicit class ExportBundleResultOps[Self <: ExportBundleResult] (val x: Self) extends AnyVal {
    
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
    def setDownloadUrl(value: DownloadUrl): Self = this.set("downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadUrl: Self = this.set("downloadUrl", js.undefined)
  }
}
