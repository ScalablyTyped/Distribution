package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssumeRoleWithSAMLResponse extends js.Object {
  
  /**
    * The identifiers for the temporary security credentials that the operation returns.
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdk.stsMod.AssumedRoleUser] = js.native
  
  /**
    *  The value of the Recipient attribute of the SubjectConfirmationData element of the SAML assertion. 
    */
  var Audience: js.UndefOr[typings.awsSdk.stsMod.Audience] = js.native
  
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.stsMod.Credentials] = js.native
  
  /**
    * The value of the Issuer element of the SAML assertion.
    */
  var Issuer: js.UndefOr[typings.awsSdk.stsMod.Issuer] = js.native
  
  /**
    * A hash value based on the concatenation of the Issuer response value, the AWS account ID, and the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of NameQualifier and Subject can be used to uniquely identify a federated user.  The following pseudocode shows how the hash value is calculated:  BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) ) 
    */
  var NameQualifier: js.UndefOr[typings.awsSdk.stsMod.NameQualifier] = js.native
  
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.native
  
  /**
    * The value of the NameID element in the Subject element of the SAML assertion.
    */
  var Subject: js.UndefOr[typings.awsSdk.stsMod.Subject] = js.native
  
  /**
    *  The format of the name ID, as defined by the Format attribute in the NameID element of the SAML assertion. Typical examples of the format are transient or persistent.   If the format includes the prefix urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as transient. If the format includes any other prefix, the format is returned with no modifications.
    */
  var SubjectType: js.UndefOr[typings.awsSdk.stsMod.SubjectType] = js.native
}
object AssumeRoleWithSAMLResponse {
  
  @scala.inline
  def apply(): AssumeRoleWithSAMLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
  }
  
  @scala.inline
  implicit class AssumeRoleWithSAMLResponseOps[Self <: AssumeRoleWithSAMLResponse] (val x: Self) extends AnyVal {
    
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
    def setAssumedRoleUser(value: AssumedRoleUser): Self = this.set("AssumedRoleUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssumedRoleUser: Self = this.set("AssumedRoleUser", js.undefined)
    
    @scala.inline
    def setAudience(value: Audience): Self = this.set("Audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("Audience", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials): Self = this.set("Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentials: Self = this.set("Credentials", js.undefined)
    
    @scala.inline
    def setIssuer(value: Issuer): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
    
    @scala.inline
    def setNameQualifier(value: NameQualifier): Self = this.set("NameQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameQualifier: Self = this.set("NameQualifier", js.undefined)
    
    @scala.inline
    def setPackedPolicySize(value: nonNegativeIntegerType): Self = this.set("PackedPolicySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackedPolicySize: Self = this.set("PackedPolicySize", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    
    @scala.inline
    def setSubjectType(value: SubjectType): Self = this.set("SubjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectType: Self = this.set("SubjectType", js.undefined)
  }
}
