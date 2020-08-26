package typings.awsSdk.stsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFederationTokenRequest extends js.Object {
  /**
    * The duration, in seconds, that the session should last. Acceptable durations for federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with 43,200 seconds (12 hours) as the default. Sessions obtained using AWS account root user credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified duration is longer than one hour, the session obtained by using root user credentials defaults to one hour.
    */
  var DurationSeconds: js.UndefOr[durationSecondsType] = js.native
  /**
    * The name of the federated user. The name is used as an identifier for the temporary security credentials (such as Bob). For example, you can reference the federated user name in a resource-based policy, such as in an Amazon S3 bucket policy. The regex used to validate this parameter is a string of characters consisting of upper- and lower-case alphanumeric characters with no spaces. You can also include underscores or any of the following characters: =,.@-
    */
  var Name: userNameType = js.native
  /**
    * An IAM policy in JSON format that you want to use as an inline session policy. You must pass an inline or managed session policy to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies. This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions. When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see Session Policies in the IAM User Guide. The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the Principal element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies. The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. The JSON policy characters can be any ASCII character from the space character to the end of the valid character list (\\u0020 through \\u00FF). It can also include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D) characters.  An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.  
    */
  var Policy: js.UndefOr[sessionPolicyDocumentType] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a managed session policy. The policies must exist in the same account as the IAM user that is requesting federated access. You must pass an inline or managed session policy to this operation. You can pass a single JSON policy document to use as an inline session policy. You can also specify up to 10 managed policies to use as managed session policies. The plain text that you use for both inline and managed session policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference. This parameter is optional. However, if you do not pass any session policies, then the resulting federated user session has no permissions. When you pass session policies, the session permissions are the intersection of the IAM user policies and the session policies that you pass. This gives you a way to further restrict the permissions for a federated user. You cannot use session policies to grant more permissions than those that are defined in the permissions policy of the IAM user. For more information, see Session Policies in the IAM User Guide. The resulting credentials can be used to access a resource that has a resource-based policy. If that policy specifically references the federated user session in the Principal element of the policy, the session has the permissions allowed by the policy. These permissions are granted in addition to the permissions that are granted by the session policies.  An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.  
    */
  var PolicyArns: js.UndefOr[policyDescriptorListType] = js.native
  /**
    * A list of session tags. Each session tag consists of a key name and an associated value. For more information about session tags, see Passing Session Tags in STS in the IAM User Guide. This parameter is optional. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.  An AWS conversion compresses the passed session policies and session tags into a packed binary format that has a separate limit. Your request can fail for this limit even if your plain text meets the other requirements. The PackedPolicySize response element indicates by percentage how close the policies and tags for your request are to the upper size limit.   You can pass a session tag with the same key as a tag that is already attached to the user you are federating. When you do, session tags override a user tag with the same key.  Tag key–value pairs are not case sensitive, but case is preserved. This means that you cannot have separate Department and department tag keys. Assume that the role has the Department=Marketing tag and you pass the department=engineering session tag. Department and department are not saved as separate tags, and the session tag passed in the request takes precedence over the role tag.
    */
  var Tags: js.UndefOr[tagListType] = js.native
}

object GetFederationTokenRequest {
  @scala.inline
  def apply(Name: userNameType): GetFederationTokenRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFederationTokenRequest]
  }
  @scala.inline
  implicit class GetFederationTokenRequestOps[Self <: GetFederationTokenRequest] (val x: Self) extends AnyVal {
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
    def setName(value: userNameType): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurationSeconds(value: durationSecondsType): Self = this.set("DurationSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSeconds: Self = this.set("DurationSeconds", js.undefined)
    @scala.inline
    def setPolicy(value: sessionPolicyDocumentType): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = this.set("PolicyArns", js.Array(value :_*))
    @scala.inline
    def setPolicyArns(value: policyDescriptorListType): Self = this.set("PolicyArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArns: Self = this.set("PolicyArns", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: tagListType): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

