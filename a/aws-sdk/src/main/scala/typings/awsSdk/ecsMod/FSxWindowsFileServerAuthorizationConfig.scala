package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FSxWindowsFileServerAuthorizationConfig extends StObject {
  
  /**
    * The authorization credential option to use. The authorization credential options can be provided using either the AWS Secrets Manager ARN or the AWS Systems Manager ARN. The ARNs refer to the stored credentials.  options:     ARN of an AWS Secrets Manager secret.    ARN of an AWS Systems Manager parameter.  
    */
  var credentialsParameter: String
  
  /**
    * A fully qualified domain name hosted by an AWS Directory Service Managed Microsoft AD (Active Directory) or self-hosted EC2 AD.
    */
  var domain: String
}
object FSxWindowsFileServerAuthorizationConfig {
  
  @scala.inline
  def apply(credentialsParameter: String, domain: String): FSxWindowsFileServerAuthorizationConfig = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSxWindowsFileServerAuthorizationConfig]
  }
  
  @scala.inline
  implicit class FSxWindowsFileServerAuthorizationConfigMutableBuilder[Self <: FSxWindowsFileServerAuthorizationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialsParameter(value: String): Self = StObject.set(x, "credentialsParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
  }
}
