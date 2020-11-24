package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialInfo extends js.Object {
  
  var createDate: String = js.native
  
  var dateLastModified: String = js.native
  
  var id: Double = js.native
  
  var identity: String = js.native
  
  var name: String = js.native
  
  var providerName: String = js.native
}
object CredentialInfo {
  
  @scala.inline
  def apply(
    createDate: String,
    dateLastModified: String,
    id: Double,
    identity: String,
    name: String,
    providerName: String
  ): CredentialInfo = {
    val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], dateLastModified = dateLastModified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialInfo]
  }
  
  @scala.inline
  implicit class CredentialInfoOps[Self <: CredentialInfo] (val x: Self) extends AnyVal {
    
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
    def setCreateDate(value: String): Self = this.set("createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateLastModified(value: String): Self = this.set("dateLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
  }
}
