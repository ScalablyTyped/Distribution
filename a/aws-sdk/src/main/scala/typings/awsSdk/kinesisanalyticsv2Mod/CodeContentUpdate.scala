package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeContentUpdate extends js.Object {
  
  /**
    * Describes an update to the location of code for an application.
    */
  var S3ContentLocationUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ContentLocationUpdate] = js.native
  
  /**
    * Describes an update to the text code for an application.
    */
  var TextContentUpdate: js.UndefOr[TextContent] = js.native
  
  /**
    * Describes an update to the zipped code for an application.
    */
  var ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.native
}
object CodeContentUpdate {
  
  @scala.inline
  def apply(): CodeContentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContentUpdate]
  }
  
  @scala.inline
  implicit class CodeContentUpdateOps[Self <: CodeContentUpdate] (val x: Self) extends AnyVal {
    
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
    def setS3ContentLocationUpdate(value: S3ContentLocationUpdate): Self = this.set("S3ContentLocationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ContentLocationUpdate: Self = this.set("S3ContentLocationUpdate", js.undefined)
    
    @scala.inline
    def setTextContentUpdate(value: TextContent): Self = this.set("TextContentUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContentUpdate: Self = this.set("TextContentUpdate", js.undefined)
    
    @scala.inline
    def setZipFileContentUpdate(value: ZipFileContent): Self = this.set("ZipFileContentUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZipFileContentUpdate: Self = this.set("ZipFileContentUpdate", js.undefined)
  }
}
