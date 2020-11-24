package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityCallbackData extends js.Object {
  
  var identity_id: String = js.native
  
  var link: String = js.native
  
  var referring_data_parsed: js.UndefOr[js.Object] = js.native
  
  var referring_identity: js.UndefOr[String] = js.native
}
object IdentityCallbackData {
  
  @scala.inline
  def apply(identity_id: String, link: String): IdentityCallbackData = {
    val __obj = js.Dynamic.literal(identity_id = identity_id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityCallbackData]
  }
  
  @scala.inline
  implicit class IdentityCallbackDataOps[Self <: IdentityCallbackData] (val x: Self) extends AnyVal {
    
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
    def setIdentity_id(value: String): Self = this.set("identity_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferring_data_parsed(value: js.Object): Self = this.set("referring_data_parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferring_data_parsed: Self = this.set("referring_data_parsed", js.undefined)
    
    @scala.inline
    def setReferring_identity(value: String): Self = this.set("referring_identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferring_identity: Self = this.set("referring_identity", js.undefined)
  }
}
