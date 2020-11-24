package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterUserOptions extends js.Object {
  
  /**
    * ARN for the master user (if IAM is enabled).
    */
  var MasterUserARN: js.UndefOr[ARN] = js.native
  
  /**
    * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.native
  
  /**
    * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserPassword: js.UndefOr[Password] = js.native
}
object MasterUserOptions {
  
  @scala.inline
  def apply(): MasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterUserOptions]
  }
  
  @scala.inline
  implicit class MasterUserOptionsOps[Self <: MasterUserOptions] (val x: Self) extends AnyVal {
    
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
    def setMasterUserARN(value: ARN): Self = this.set("MasterUserARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserARN: Self = this.set("MasterUserARN", js.undefined)
    
    @scala.inline
    def setMasterUserName(value: Username): Self = this.set("MasterUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserName: Self = this.set("MasterUserName", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: Password): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
  }
}
