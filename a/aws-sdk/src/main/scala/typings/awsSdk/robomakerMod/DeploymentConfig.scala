package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentConfig extends StObject {
  
  /**
    * The percentage of robots receiving the deployment at the same time.
    */
  var concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The download condition file.
    */
  var downloadConditionFile: js.UndefOr[S3Object] = js.undefined
  
  /**
    * The percentage of deployments that need to fail before stopping deployment.
    */
  var failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The amount of time, in seconds, to wait for deployment to a single robot to complete. Choose a time between 1 minute and 7 days. The default is 5 hours.
    */
  var robotDeploymentTimeoutInSeconds: js.UndefOr[DeploymentTimeout] = js.undefined
}
object DeploymentConfig {
  
  inline def apply(): DeploymentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentConfig]
  }
  
  extension [Self <: DeploymentConfig](x: Self) {
    
    inline def setConcurrentDeploymentPercentage(value: Percentage): Self = StObject.set(x, "concurrentDeploymentPercentage", value.asInstanceOf[js.Any])
    
    inline def setConcurrentDeploymentPercentageUndefined: Self = StObject.set(x, "concurrentDeploymentPercentage", js.undefined)
    
    inline def setDownloadConditionFile(value: S3Object): Self = StObject.set(x, "downloadConditionFile", value.asInstanceOf[js.Any])
    
    inline def setDownloadConditionFileUndefined: Self = StObject.set(x, "downloadConditionFile", js.undefined)
    
    inline def setFailureThresholdPercentage(value: Percentage): Self = StObject.set(x, "failureThresholdPercentage", value.asInstanceOf[js.Any])
    
    inline def setFailureThresholdPercentageUndefined: Self = StObject.set(x, "failureThresholdPercentage", js.undefined)
    
    inline def setRobotDeploymentTimeoutInSeconds(value: DeploymentTimeout): Self = StObject.set(x, "robotDeploymentTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRobotDeploymentTimeoutInSecondsUndefined: Self = StObject.set(x, "robotDeploymentTimeoutInSeconds", js.undefined)
  }
}
