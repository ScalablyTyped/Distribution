package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePresignedDomainUrlResponse extends js.Object {
  
  /**
    * The presigned URL.
    */
  var AuthorizedUrl: js.UndefOr[PresignedDomainUrl] = js.native
}
object CreatePresignedDomainUrlResponse {
  
  @scala.inline
  def apply(): CreatePresignedDomainUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresignedDomainUrlResponse]
  }
  
  @scala.inline
  implicit class CreatePresignedDomainUrlResponseOps[Self <: CreatePresignedDomainUrlResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthorizedUrl(value: PresignedDomainUrl): Self = this.set("AuthorizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizedUrl: Self = this.set("AuthorizedUrl", js.undefined)
  }
}
