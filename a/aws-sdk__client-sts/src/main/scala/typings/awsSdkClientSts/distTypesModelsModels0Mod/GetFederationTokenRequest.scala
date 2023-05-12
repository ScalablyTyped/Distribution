package typings.awsSdkClientSts.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFederationTokenRequest extends StObject {
  
  /**
    * <p>The duration, in seconds, that the session should last. Acceptable durations for
    *          federation sessions range from 900 seconds (15 minutes) to 129,600 seconds (36 hours), with
    *          43,200 seconds (12 hours) as the default. Sessions obtained using root user
    *          credentials are restricted to a maximum of 3,600 seconds (one hour). If the specified
    *          duration is longer than one hour, the session obtained by using root user credentials
    *          defaults to one hour.</p>
    */
  var DurationSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The name of the federated user. The name is used as an identifier for the temporary
    *          security credentials (such as <code>Bob</code>). For example, you can reference the
    *          federated user name in a resource-based policy, such as in an Amazon S3 bucket policy.</p>
    *          <p>The regex used to validate this parameter is a string of characters
    *     consisting of upper- and lower-case alphanumeric characters with no spaces. You can
    *     also include underscores or any of the following characters: =,.@-</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An IAM policy in JSON format that you want to use as an inline session policy.</p>
    *          <p>You must pass an inline or managed <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a> to
    *          this operation. You can pass a single JSON policy document to use as an inline session
    *          policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as
    *          managed session policies.</p>
    *          <p>This parameter is optional. However, if you do not pass any session policies, then the
    *          resulting federated user session has no permissions.</p>
    *          <p>When you pass session policies, the session permissions are the intersection of the
    *          IAM user policies and the session policies that you pass. This gives you a way to further
    *          restrict the permissions for a federated user. You cannot use session policies to grant
    *          more permissions than those that are defined in the permissions policy of the IAM user.
    *          For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session Policies</a> in
    *          the <i>IAM User Guide</i>.</p>
    *          <p>The resulting credentials can be used to access a resource that has a resource-based
    *          policy. If that policy specifically references the federated user session in the
    *             <code>Principal</code> element of the policy, the session has the permissions allowed by
    *          the policy. These permissions are granted in addition to the permissions that are granted
    *          by the session policies.</p>
    *          <p>The plaintext that you use for both inline and managed session policies can't exceed
    *          2,048 characters. The JSON policy characters can be any ASCII character from the space
    *          character to the end of the valid character list (\\u0020 through \\u00FF). It can also
    *          include the tab (\\u0009), linefeed (\\u000A), and carriage return (\\u000D)
    *          characters.</p>
    *          <note>
    *             <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs,
    *             and session tags into a packed binary format that has a separate limit. Your request can
    *             fail for this limit even if your plaintext meets the other requirements. The
    *                <code>PackedPolicySize</code> response element indicates by percentage how close the
    *             policies and tags for your request are to the upper size limit.</p>
    *          </note>
    */
  var Policy: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Resource Names (ARNs) of the IAM managed policies that you want to use as a
    *          managed session policy. The policies must exist in the same account as the IAM user that
    *          is requesting federated access.</p>
    *          <p>You must pass an inline or managed <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">session policy</a> to
    *          this operation. You can pass a single JSON policy document to use as an inline session
    *          policy. You can also specify up to 10 managed policy Amazon Resource Names (ARNs) to use as
    *          managed session policies. The plaintext that you use for both inline and managed session
    *          policies can't exceed 2,048 characters. You can provide up to 10 managed policy ARNs. For
    *          more information about ARNs, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and Amazon Web Services
    *             Service Namespaces</a> in the Amazon Web Services General Reference.</p>
    *          <p>This parameter is optional. However, if you do not pass any session policies, then the
    *          resulting federated user session has no permissions.</p>
    *          <p>When you pass session policies, the session permissions are the intersection of the
    *          IAM user policies and the session policies that you pass. This gives you a way to further
    *          restrict the permissions for a federated user. You cannot use session policies to grant
    *          more permissions than those that are defined in the permissions policy of the IAM user.
    *          For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#policies_session">Session Policies</a> in
    *          the <i>IAM User Guide</i>.</p>
    *          <p>The resulting credentials can be used to access a resource that has a resource-based
    *          policy. If that policy specifically references the federated user session in the
    *             <code>Principal</code> element of the policy, the session has the permissions allowed by
    *          the policy. These permissions are granted in addition to the permissions that are granted
    *          by the session policies.</p>
    *          <note>
    *             <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs,
    *             and session tags into a packed binary format that has a separate limit. Your request can
    *             fail for this limit even if your plaintext meets the other requirements. The
    *                <code>PackedPolicySize</code> response element indicates by percentage how close the
    *             policies and tags for your request are to the upper size limit.</p>
    *          </note>
    */
  var PolicyArns: js.UndefOr[js.Array[PolicyDescriptorType]] = js.undefined
  
  /**
    * <p>A list of session tags. Each session tag consists of a key name and an associated value.
    *          For more information about session tags, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in STS</a> in the
    *             <i>IAM User Guide</i>.</p>
    *          <p>This parameter is optional. You can pass up to 50 session tags. The plaintext session
    *          tag keys can’t exceed 128 characters and the values can’t exceed 256 characters. For these
    *          and additional limits, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html#reference_iam-limits-entity-length">IAM
    *             and STS Character Limits</a> in the <i>IAM User Guide</i>.</p>
    *          <note>
    *             <p>An Amazon Web Services conversion compresses the passed inline session policy, managed policy ARNs,
    *             and session tags into a packed binary format that has a separate limit. Your request can
    *             fail for this limit even if your plaintext meets the other requirements. The
    *                <code>PackedPolicySize</code> response element indicates by percentage how close the
    *             policies and tags for your request are to the upper size limit.</p>
    *          </note>
    *          <p>You can pass a session tag with the same key as a tag that is already attached to the
    *          user you are federating. When you do, session tags override a user tag with the same key. </p>
    *          <p>Tag key–value pairs are not case sensitive, but case is preserved. This means that you
    *          cannot have separate <code>Department</code> and <code>department</code> tag keys. Assume
    *          that the role has the <code>Department</code>=<code>Marketing</code> tag and you pass the
    *             <code>department</code>=<code>engineering</code> session tag. <code>Department</code>
    *          and <code>department</code> are not saved as separate tags, and the session tag passed in
    *          the request takes precedence over the role tag.</p>
    */
  var Tags: js.UndefOr[js.Array[Tag]] = js.undefined
}
object GetFederationTokenRequest {
  
  inline def apply(): GetFederationTokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFederationTokenRequest] (val x: Self) extends AnyVal {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyArns(value: js.Array[PolicyDescriptorType]): Self = StObject.set(x, "PolicyArns", value.asInstanceOf[js.Any])
    
    inline def setPolicyArnsUndefined: Self = StObject.set(x, "PolicyArns", js.undefined)
    
    inline def setPolicyArnsVarargs(value: PolicyDescriptorType*): Self = StObject.set(x, "PolicyArns", js.Array(value*))
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
