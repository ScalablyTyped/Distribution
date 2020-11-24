package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLOptionsInput extends js.Object {
  
  /**
    * True if SAML is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the SAML Identity Provider's information.
    */
  var Idp: js.UndefOr[SAMLIdp] = js.native
  
  /**
    * The backend role to which the SAML master user is mapped to.
    */
  var MasterBackendRole: js.UndefOr[BackendRole] = js.native
  
  /**
    * The SAML master username, which is stored in the Amazon Elasticsearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.native
  
  /**
    * The key to use for matching the SAML Roles attribute.
    */
  var RolesKey: js.UndefOr[String] = js.native
  
  /**
    * The duration, in minutes, after which a user session becomes inactive. Acceptable values are between 1 and 1440, and the default value is 60.
    */
  var SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.native
  
  /**
    * The key to use for matching the SAML Subject attribute.
    */
  var SubjectKey: js.UndefOr[String] = js.native
}
object SAMLOptionsInput {
  
  @scala.inline
  def apply(): SAMLOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLOptionsInput]
  }
  
  @scala.inline
  implicit class SAMLOptionsInputOps[Self <: SAMLOptionsInput] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    
    @scala.inline
    def setIdp(value: SAMLIdp): Self = this.set("Idp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdp: Self = this.set("Idp", js.undefined)
    
    @scala.inline
    def setMasterBackendRole(value: BackendRole): Self = this.set("MasterBackendRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterBackendRole: Self = this.set("MasterBackendRole", js.undefined)
    
    @scala.inline
    def setMasterUserName(value: Username): Self = this.set("MasterUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserName: Self = this.set("MasterUserName", js.undefined)
    
    @scala.inline
    def setRolesKey(value: String): Self = this.set("RolesKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolesKey: Self = this.set("RolesKey", js.undefined)
    
    @scala.inline
    def setSessionTimeoutMinutes(value: IntegerClass): Self = this.set("SessionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeoutMinutes: Self = this.set("SessionTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setSubjectKey(value: String): Self = this.set("SubjectKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectKey: Self = this.set("SubjectKey", js.undefined)
  }
}
