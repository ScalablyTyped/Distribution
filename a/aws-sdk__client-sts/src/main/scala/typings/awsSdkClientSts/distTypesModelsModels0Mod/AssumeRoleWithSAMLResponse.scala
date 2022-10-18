package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeRoleWithSAMLResponse extends StObject {
  
  /**
    * <p>The identifiers for the temporary security credentials that the operation
    *          returns.</p>
    */
  var AssumedRoleUser: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.AssumedRoleUser] = js.undefined
  
  /**
    * <p> The value of the <code>Recipient</code> attribute of the
    *             <code>SubjectConfirmationData</code> element of the SAML assertion. </p>
    */
  var Audience: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The temporary security credentials, which include an access key ID, a secret access key,
    *          and a security (or session) token.</p>
    *
    *          <note>
    *             <p>The size of the security token that STS API operations return is not fixed. We
    *         strongly recommend that you make no assumptions about the maximum size.</p>
    *          </note>
    */
  var Credentials: js.UndefOr[typings.awsSdkClientSts.distTypesModelsModels0Mod.Credentials] = js.undefined
  
  /**
    * <p>The value of the <code>Issuer</code> element of the SAML assertion.</p>
    */
  var Issuer: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A hash value based on the concatenation of the following:</p>
    *          <ul>
    *             <li>
    *                <p>The <code>Issuer</code> response value.</p>
    *             </li>
    *             <li>
    *                <p>The Amazon Web Services account ID.</p>
    *             </li>
    *             <li>
    *                <p>The friendly name (the last part of the ARN) of the SAML provider in IAM.</p>
    *             </li>
    *          </ul>
    *          <p>The combination of <code>NameQualifier</code> and <code>Subject</code> can be used to
    *          uniquely identify a federated user.</p>
    *          <p>The following pseudocode shows how the hash value is calculated:</p>
    *          <p>
    *             <code>BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) )</code>
    *          </p>
    */
  var NameQualifier: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A percentage value that indicates the packed size of the session policies and session
    *       tags combined passed in the request. The request fails if the packed size is greater than 100 percent,
    *       which means the policies and tags exceeded the allowed space.</p>
    */
  var PackedPolicySize: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The value in the <code>SourceIdentity</code> attribute in the SAML assertion. </p>
    *          <p>You can require users to set a source identity value when they assume a role. You do
    *          this by using the <code>sts:SourceIdentity</code> condition key in a role trust policy.
    *          That way, actions that are taken with the role are associated with that user. After the
    *          source identity is set, the value cannot be changed. It is present in the request for all
    *          actions that are taken by the role and persists across <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts#iam-term-role-chaining">chained
    *             role</a> sessions. You can configure your SAML identity provider to use an attribute
    *          associated with your users, like user name or email, as the source identity when calling
    *             <code>AssumeRoleWithSAML</code>. You do this by adding an attribute to the SAML
    *          assertion. For more information about using source identity, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_monitor.html">Monitor and control
    *             actions taken with assumed roles</a> in the
    *          <i>IAM User Guide</i>.</p>
    *          <p>The regex used to validate this parameter is a string of characters
    *     consisting of upper- and lower-case alphanumeric characters with no spaces. You can
    *     also include underscores or any of the following characters: =,.@-</p>
    */
  var SourceIdentity: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The value of the <code>NameID</code> element in the <code>Subject</code> element of the
    *          SAML assertion.</p>
    */
  var Subject: js.UndefOr[String] = js.undefined
  
  /**
    * <p> The format of the name ID, as defined by the <code>Format</code> attribute in the
    *             <code>NameID</code> element of the SAML assertion. Typical examples of the format are
    *             <code>transient</code> or <code>persistent</code>. </p>
    *          <p> If the format includes the prefix
    *             <code>urn:oasis:names:tc:SAML:2.0:nameid-format</code>, that prefix is removed. For
    *          example, <code>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</code> is returned as
    *             <code>transient</code>. If the format includes any other prefix, the format is returned
    *          with no modifications.</p>
    */
  var SubjectType: js.UndefOr[String] = js.undefined
}
object AssumeRoleWithSAMLResponse {
  
  inline def apply(): AssumeRoleWithSAMLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
  }
  
  extension [Self <: AssumeRoleWithSAMLResponse](x: Self) {
    
    inline def setAssumedRoleUser(value: AssumedRoleUser): Self = StObject.set(x, "AssumedRoleUser", value.asInstanceOf[js.Any])
    
    inline def setAssumedRoleUserUndefined: Self = StObject.set(x, "AssumedRoleUser", js.undefined)
    
    inline def setAudience(value: String): Self = StObject.set(x, "Audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "Audience", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    inline def setNameQualifier(value: String): Self = StObject.set(x, "NameQualifier", value.asInstanceOf[js.Any])
    
    inline def setNameQualifierUndefined: Self = StObject.set(x, "NameQualifier", js.undefined)
    
    inline def setPackedPolicySize(value: Double): Self = StObject.set(x, "PackedPolicySize", value.asInstanceOf[js.Any])
    
    inline def setPackedPolicySizeUndefined: Self = StObject.set(x, "PackedPolicySize", js.undefined)
    
    inline def setSourceIdentity(value: String): Self = StObject.set(x, "SourceIdentity", value.asInstanceOf[js.Any])
    
    inline def setSourceIdentityUndefined: Self = StObject.set(x, "SourceIdentity", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectType(value: String): Self = StObject.set(x, "SubjectType", value.asInstanceOf[js.Any])
    
    inline def setSubjectTypeUndefined: Self = StObject.set(x, "SubjectType", js.undefined)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
  }
}
