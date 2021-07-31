package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    * Details of the new policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. This parameter is required. The following example creates a resource policy enabling the Route 53 service to put DNS query logs in to the specified log group. Replace "logArn" with the ARN of your CloudWatch Logs resource, such as a log group or log stream.  { "Version": "2012-10-17", "Statement": [ { "Sid": "Route53LogsToCloudWatchLogs", "Effect": "Allow", "Principal": { "Service": [ "route53.amazonaws.com" ] }, "Action":"logs:PutLogEvents", "Resource": "logArn" } ] }  
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.undefined
  
  /**
    * Name of the new policy. This parameter is required.
    */
  var policyName: js.UndefOr[PolicyName] = js.undefined
}
object PutResourcePolicyRequest {
  
  @scala.inline
  def apply(): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit class PutResourcePolicyRequestMutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
