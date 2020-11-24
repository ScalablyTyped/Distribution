package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLinkResponse extends js.Object {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.networkmanagerMod.Link] = js.native
}
object DeleteLinkResponse {
  
  @scala.inline
  def apply(): DeleteLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLinkResponse]
  }
  
  @scala.inline
  implicit class DeleteLinkResponseOps[Self <: DeleteLinkResponse] (val x: Self) extends AnyVal {
    
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
    def setLink(value: Link): Self = this.set("Link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("Link", js.undefined)
  }
}
