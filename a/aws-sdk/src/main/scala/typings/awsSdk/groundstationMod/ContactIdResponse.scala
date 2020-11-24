package typings.awsSdk.groundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactIdResponse extends js.Object {
  
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.native
}
object ContactIdResponse {
  
  @scala.inline
  def apply(): ContactIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactIdResponse]
  }
  
  @scala.inline
  implicit class ContactIdResponseOps[Self <: ContactIdResponse] (val x: Self) extends AnyVal {
    
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
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactId: Self = this.set("contactId", js.undefined)
  }
}
