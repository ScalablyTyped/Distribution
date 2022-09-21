package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectPolicy extends StObject {
  
  /**
    * The Unix datetime for the creation of the project policy.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Unix datetime for when the project policy was last updated. 
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The JSON document for the project policy.
    */
  var PolicyDocument: js.UndefOr[ProjectPolicyDocument] = js.undefined
  
  /**
    * The name of the project policy.
    */
  var PolicyName: js.UndefOr[ProjectPolicyName] = js.undefined
  
  /**
    * The revision ID of the project policy.
    */
  var PolicyRevisionId: js.UndefOr[ProjectPolicyRevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the project to which the project policy is attached.
    */
  var ProjectArn: js.UndefOr[typings.awsSdk.rekognitionMod.ProjectArn] = js.undefined
}
object ProjectPolicy {
  
  inline def apply(): ProjectPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectPolicy]
  }
  
  extension [Self <: ProjectPolicy](x: Self) {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setPolicyDocument(value: ProjectPolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPolicyName(value: ProjectPolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    inline def setPolicyRevisionId(value: ProjectPolicyRevisionId): Self = StObject.set(x, "PolicyRevisionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyRevisionIdUndefined: Self = StObject.set(x, "PolicyRevisionId", js.undefined)
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setProjectArnUndefined: Self = StObject.set(x, "ProjectArn", js.undefined)
  }
}
