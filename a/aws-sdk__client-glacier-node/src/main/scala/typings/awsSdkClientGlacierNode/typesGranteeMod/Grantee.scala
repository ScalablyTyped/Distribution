package typings.awsSdkClientGlacierNode.typesGranteeMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.AmazonCustomerByEmail
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.CanonicalUser
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grantee extends js.Object {
  
  /**
    * <p>Screen name of the grantee.</p>
    */
  var DisplayName: js.UndefOr[String] = js.native
  
  /**
    * <p>Email address of the grantee.</p>
    */
  var EmailAddress: js.UndefOr[String] = js.native
  
  /**
    * <p>The canonical user ID of the grantee.</p>
    */
  var ID: js.UndefOr[String] = js.native
  
  /**
    * <p>Type of grantee</p>
    */
  var Type: AmazonCustomerByEmail | CanonicalUser | Group | String = js.native
  
  /**
    * <p>URI of the grantee group.</p>
    */
  var URI: js.UndefOr[String] = js.native
}
object Grantee {
  
  @scala.inline
  def apply(Type: AmazonCustomerByEmail | CanonicalUser | Group | String): Grantee = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grantee]
  }
  
  @scala.inline
  implicit class GranteeOps[Self <: Grantee] (val x: Self) extends AnyVal {
    
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
    def setType(value: AmazonCustomerByEmail | CanonicalUser | Group | String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("EmailAddress", js.undefined)
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteURI: Self = this.set("URI", js.undefined)
  }
}
