package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaTarget extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    *  A LambdaFunctionInfo object that describes a target Lambda function. 
    */
  var lambdaFunctionInfo: js.UndefOr[LambdaFunctionInfo] = js.undefined
  
  /**
    *  The date and time when the target Lambda function was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.undefined
  
  /**
    *  The lifecycle events of the deployment to this target Lambda function. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  
  /**
    *  The status an AWS Lambda deployment's target Lambda function. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
  
  /**
    *  The unique ID of a deployment target that has a type of lambdaTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}
object LambdaTarget {
  
  inline def apply(): LambdaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaTarget]
  }
  
  extension [Self <: LambdaTarget](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setLambdaFunctionInfo(value: LambdaFunctionInfo): Self = StObject.set(x, "lambdaFunctionInfo", value.asInstanceOf[js.Any])
    
    inline def setLambdaFunctionInfoUndefined: Self = StObject.set(x, "lambdaFunctionInfo", js.undefined)
    
    inline def setLastUpdatedAt(value: Time): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setLifecycleEvents(value: LifecycleEventList): Self = StObject.set(x, "lifecycleEvents", value.asInstanceOf[js.Any])
    
    inline def setLifecycleEventsUndefined: Self = StObject.set(x, "lifecycleEvents", js.undefined)
    
    inline def setLifecycleEventsVarargs(value: LifecycleEvent*): Self = StObject.set(x, "lifecycleEvents", js.Array(value :_*))
    
    inline def setStatus(value: TargetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetArn(value: TargetArn): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "targetArn", js.undefined)
    
    inline def setTargetId(value: TargetId): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
