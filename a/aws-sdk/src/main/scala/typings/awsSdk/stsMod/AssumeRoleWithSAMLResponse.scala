package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleWithSAMLResponse extends StObject {
  
  /**
    * The identifiers for the temporary security credentials that the operation returns.
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdk.stsMod.AssumedRoleUser] = js.undefined
  
  /**
    *  The value of the Recipient attribute of the SubjectConfirmationData element of the SAML assertion. 
    */
  var Audience: js.UndefOr[typings.awsSdk.stsMod.Audience] = js.undefined
  
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[typings.awsSdk.stsMod.Credentials] = js.undefined
  
  /**
    * The value of the Issuer element of the SAML assertion.
    */
  var Issuer: js.UndefOr[typings.awsSdk.stsMod.Issuer] = js.undefined
  
  /**
    * A hash value based on the concatenation of the Issuer response value, the AWS account ID, and the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of NameQualifier and Subject can be used to uniquely identify a federated user.  The following pseudocode shows how the hash value is calculated:  BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) ) 
    */
  var NameQualifier: js.UndefOr[typings.awsSdk.stsMod.NameQualifier] = js.undefined
  
  /**
    * A percentage value that indicates the packed size of the session policies and session tags combined passed in the request. The request fails if the packed size is greater than 100 percent, which means the policies and tags exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  
  /**
    * The value of the NameID element in the Subject element of the SAML assertion.
    */
  var Subject: js.UndefOr[typings.awsSdk.stsMod.Subject] = js.undefined
  
  /**
    *  The format of the name ID, as defined by the Format attribute in the NameID element of the SAML assertion. Typical examples of the format are transient or persistent.   If the format includes the prefix urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as transient. If the format includes any other prefix, the format is returned with no modifications.
    */
  var SubjectType: js.UndefOr[typings.awsSdk.stsMod.SubjectType] = js.undefined
}
object AssumeRoleWithSAMLResponse {
  
  @scala.inline
  def apply(): AssumeRoleWithSAMLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
  }
  
  @scala.inline
  implicit class AssumeRoleWithSAMLResponseMutableBuilder[Self <: AssumeRoleWithSAMLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssumedRoleUser(value: AssumedRoleUser): Self = StObject.set(x, "AssumedRoleUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssumedRoleUserUndefined: Self = StObject.set(x, "AssumedRoleUser", js.undefined)
    
    @scala.inline
    def setAudience(value: Audience): Self = StObject.set(x, "Audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "Audience", js.undefined)
    
    @scala.inline
    def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    @scala.inline
    def setIssuer(value: Issuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    @scala.inline
    def setNameQualifier(value: NameQualifier): Self = StObject.set(x, "NameQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameQualifierUndefined: Self = StObject.set(x, "NameQualifier", js.undefined)
    
    @scala.inline
    def setPackedPolicySize(value: nonNegativeIntegerType): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectType(value: SubjectType): Self = StObject.set(x, "SubjectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectTypeUndefined: Self = StObject.set(x, "SubjectType", js.undefined)
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
