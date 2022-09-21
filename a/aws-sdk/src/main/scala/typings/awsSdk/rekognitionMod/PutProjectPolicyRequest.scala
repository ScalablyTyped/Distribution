package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutProjectPolicyRequest extends StObject {
  
  /**
    * A resource policy to add to the model. The policy is a JSON structure that contains one or more statements that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON policy document, see IAM JSON policy reference. 
    */
  var PolicyDocument: ProjectPolicyDocument
  
  /**
    * A name for the policy.
    */
  var PolicyName: ProjectPolicyName
  
  /**
    * The revision ID for the Project Policy. Each time you modify a policy, Amazon Rekognition Custom Labels generates and assigns a new PolicyRevisionId and then deletes the previous version of the policy.
    */
  var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project that the project policy is attached to.
    */
  var ProjectArn: typings.awsSdk.rekognitionMod.ProjectArn
}
object PutProjectPolicyRequest {
  
  inline def apply(PolicyDocument: ProjectPolicyDocument, PolicyName: ProjectPolicyName, ProjectArn: ProjectArn): PutProjectPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyDocument = PolicyDocument.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutProjectPolicyRequest]
  }
  
  extension [Self <: PutProjectPolicyRequest](x: Self) {
    
    inline def setPolicyDocument(value: ProjectPolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyName(value: ProjectPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionId(value: ProjectPolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
  }
}
