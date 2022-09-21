package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentResponse extends StObject {
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the IoT job that applies the deployment to target devices.
    */
  var iotJobArn: js.UndefOr[IoTJobARN] = js.undefined
  
  /**
    * The ID of the IoT job that applies the deployment to target devices.
    */
  var iotJobId: js.UndefOr[NonEmptyString] = js.undefined
}
object CreateDeploymentResponse {
  
  inline def apply(): CreateDeploymentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResponse]
  }
  
  extension [Self <: CreateDeploymentResponse](x: Self) {
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setIotJobArn(value: IoTJobARN): Self = StObject.set(x, "iotJobArn", value.asInstanceOf[js.Any])
    
    inline def setIotJobArnUndefined: Self = StObject.set(x, "iotJobArn", js.undefined)
    
    inline def setIotJobId(value: NonEmptyString): Self = StObject.set(x, "iotJobId", value.asInstanceOf[js.Any])
    
    inline def setIotJobIdUndefined: Self = StObject.set(x, "iotJobId", js.undefined)
  }
}
