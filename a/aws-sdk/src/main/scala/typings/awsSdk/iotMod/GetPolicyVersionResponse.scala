package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPolicyVersionResponse extends StObject {
  
  /**
    * The date the policy was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The generation ID of the policy version.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  
  /**
    * The date the policy was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}
object GetPolicyVersionResponse {
  
  @scala.inline
  def apply(): GetPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPolicyVersionResponse]
  }
  
  @scala.inline
  implicit class GetPolicyVersionResponseMutableBuilder[Self <: GetPolicyVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setGenerationId(value: GenerationId): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationIdUndefined: Self = StObject.set(x, "generationId", js.undefined)
    
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = StObject.set(x, "isDefaultVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultVersionUndefined: Self = StObject.set(x, "isDefaultVersion", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setPolicyArn(value: PolicyArn): Self = StObject.set(x, "policyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyArnUndefined: Self = StObject.set(x, "policyArn", js.undefined)
    
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = StObject.set(x, "policyDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentUndefined: Self = StObject.set(x, "policyDocument", js.undefined)
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionIdUndefined: Self = StObject.set(x, "policyVersionId", js.undefined)
  }
}
