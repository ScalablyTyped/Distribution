package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSxWindowsFileServerAuthorizationConfig extends js.Object {
  
  /**
    * The authorization credential option to use. The authorization credential options can be provided using either the AWS Secrets Manager ARN or the AWS Systems Manager ARN. The ARNs refer to the stored credentials.  options:     ARN of an AWS Secrets Manager secret.    ARN of an AWS Systems Manager parameter.  
    */
  var credentialsParameter: String = js.native
  
  /**
    * A fully qualified domain name hosted by an AWS Directory Service Managed Microsoft AD (Active Directory) or self-hosted EC2 AD.
    */
  var domain: String = js.native
}
object FSxWindowsFileServerAuthorizationConfig {
  
  @scala.inline
  def apply(credentialsParameter: String, domain: String): FSxWindowsFileServerAuthorizationConfig = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSxWindowsFileServerAuthorizationConfig]
  }
  
  @scala.inline
  implicit class FSxWindowsFileServerAuthorizationConfigOps[Self <: FSxWindowsFileServerAuthorizationConfig] (val x: Self) extends AnyVal {
    
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
    def setCredentialsParameter(value: String): Self = this.set("credentialsParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
  }
}
