package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationPresignedUrlResponse extends js.Object {
  
  /**
    * The URL of the extension.
    */
  var AuthorizedUrl: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.AuthorizedUrl] = js.native
}
object CreateApplicationPresignedUrlResponse {
  
  @scala.inline
  def apply(): CreateApplicationPresignedUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationPresignedUrlResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationPresignedUrlResponseOps[Self <: CreateApplicationPresignedUrlResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthorizedUrl(value: AuthorizedUrl): Self = this.set("AuthorizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedUrl: Self = this.set("AuthorizedUrl", js.undefined)
  }
}
