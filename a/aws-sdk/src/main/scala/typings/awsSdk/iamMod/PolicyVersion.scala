package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyVersion extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when the policy version was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  /**
    * The policy document. The policy document is returned in the response to the GetPolicyVersion and GetAccountAuthorizationDetails operations. It is not returned in the response to the CreatePolicyVersion or ListPolicyVersions operations.  The policy document returned in this structure is URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.
    */
  var Document: js.UndefOr[policyDocumentType] = js.native
  /**
    * Specifies whether the policy version is set as the policy's default version.
    */
  var IsDefaultVersion: js.UndefOr[booleanType] = js.native
  /**
    * The identifier for the policy version. Policy version identifiers always begin with v (always lowercase). When a policy is created, the first policy version is v1. 
    */
  var VersionId: js.UndefOr[policyVersionIdType] = js.native
}

object PolicyVersion {
  @scala.inline
  def apply(): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersion]
  }
  @scala.inline
  implicit class PolicyVersionOps[Self <: PolicyVersion] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    @scala.inline
    def setDocument(value: policyDocumentType): Self = this.set("Document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("Document", js.undefined)
    @scala.inline
    def setIsDefaultVersion(value: booleanType): Self = this.set("IsDefaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultVersion: Self = this.set("IsDefaultVersion", js.undefined)
    @scala.inline
    def setVersionId(value: policyVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("VersionId", js.undefined)
  }
  
}

