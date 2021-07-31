package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyVersion extends StObject {
  
  /**
    * The date and time, in ISO 8601 date-time format, when the policy version was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  
  /**
    * The policy document. The policy document is returned in the response to the GetPolicyVersion and GetAccountAuthorizationDetails operations. It is not returned in the response to the CreatePolicyVersion or ListPolicyVersions operations.  The policy document returned in this structure is URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.
    */
  var Document: js.UndefOr[policyDocumentType] = js.undefined
  
  /**
    * Specifies whether the policy version is set as the policy's default version.
    */
  var IsDefaultVersion: js.UndefOr[booleanType] = js.undefined
  
  /**
    * The identifier for the policy version. Policy version identifiers always begin with v (always lowercase). When a policy is created, the first policy version is v1. 
    */
  var VersionId: js.UndefOr[policyVersionIdType] = js.undefined
}
object PolicyVersion {
  
  @scala.inline
  def apply(): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersion]
  }
  
  @scala.inline
  implicit class PolicyVersionMutableBuilder[Self <: PolicyVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setDocument(value: policyDocumentType): Self = StObject.set(x, "Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "Document", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: booleanType): Self = StObject.set(x, "IsDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultVersionUndefined: Self = StObject.set(x, "IsDefaultVersion", js.undefined)
    
    @scala.inline
    def setVersionId(value: policyVersionIdType): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
