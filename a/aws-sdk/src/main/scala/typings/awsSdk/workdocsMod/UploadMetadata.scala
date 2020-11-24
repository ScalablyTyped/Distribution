package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadMetadata extends js.Object {
  
  /**
    * The signed headers.
    */
  var SignedHeaders: js.UndefOr[SignedHeaderMap] = js.native
  
  /**
    * The URL of the upload.
    */
  var UploadUrl: js.UndefOr[UrlType] = js.native
}
object UploadMetadata {
  
  @scala.inline
  def apply(): UploadMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMetadata]
  }
  
  @scala.inline
  implicit class UploadMetadataOps[Self <: UploadMetadata] (val x: Self) extends AnyVal {
    
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
    def setSignedHeaders(value: SignedHeaderMap): Self = this.set("SignedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedHeaders: Self = this.set("SignedHeaders", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: UrlType): Self = this.set("UploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("UploadUrl", js.undefined)
  }
}
