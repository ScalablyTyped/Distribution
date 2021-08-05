package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentTarget extends StObject {
  
  /**
    * The ARN that specifies the Amazon Inspector assessment target.
    */
  var arn: Arn
  
  /**
    * The time at which the assessment target is created.
    */
  var createdAt: Timestamp
  
  /**
    * The name of the Amazon Inspector assessment target.
    */
  var name: AssessmentTargetName
  
  /**
    * The ARN that specifies the resource group that is associated with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which UpdateAssessmentTarget is called.
    */
  var updatedAt: Timestamp
}
object AssessmentTarget {
  
  inline def apply(arn: Arn, createdAt: Timestamp, name: AssessmentTargetName, updatedAt: Timestamp): AssessmentTarget = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssessmentTarget]
  }
  
  extension [Self <: AssessmentTarget](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: AssessmentTargetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupArn(value: Arn): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupArnUndefined: Self = StObject.set(x, "resourceGroupArn", js.undefined)
    
    inline def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
