package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAMLOptionsOutput extends js.Object {
  
  /**
    * True if SAML is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Describes the SAML Identity Provider's information.
    */
  var Idp: js.UndefOr[SAMLIdp] = js.native
  
  /**
    * The key used for matching the SAML Roles attribute.
    */
  var RolesKey: js.UndefOr[String] = js.native
  
  /**
    * The duration, in minutes, after which a user session becomes inactive.
    */
  var SessionTimeoutMinutes: js.UndefOr[IntegerClass] = js.native
  
  /**
    * The key used for matching the SAML Subject attribute.
    */
  var SubjectKey: js.UndefOr[String] = js.native
}
object SAMLOptionsOutput {
  
  @scala.inline
  def apply(): SAMLOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLOptionsOutput]
  }
  
  @scala.inline
  implicit class SAMLOptionsOutputOps[Self <: SAMLOptionsOutput] (val x: Self) extends AnyVal {
    
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
