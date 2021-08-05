package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressDetail extends StObject {
  
  /**
    * The current progress status.  Validating  Validating the deployment.  DownloadingExtracting  Downloading and extracting the bundle on the robot.  ExecutingPreLaunch  Executing pre-launch script(s) if provided.  Launching  Launching the robot application.  ExecutingPostLaunch  Executing post-launch script(s) if provided.  Finished  Deployment is complete.  
    */
  var currentProgress: js.UndefOr[RobotDeploymentStep] = js.undefined
  
  /**
    * Estimated amount of time in seconds remaining in the step. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger] = js.undefined
  
  /**
    * Precentage of the step that is done. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var percentDone: js.UndefOr[PercentDone] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var targetResource: js.UndefOr[GenericString] = js.undefined
}
object ProgressDetail {
  
  inline def apply(): ProgressDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressDetail]
  }
  
  extension [Self <: ProgressDetail](x: Self) {
    
    inline def setCurrentProgress(value: RobotDeploymentStep): Self = StObject.set(x, "currentProgress", value.asInstanceOf[js.Any])
    
    inline def setCurrentProgressUndefined: Self = StObject.set(x, "currentProgress", js.undefined)
    
    inline def setEstimatedTimeRemainingSeconds(value: GenericInteger): Self = StObject.set(x, "estimatedTimeRemainingSeconds", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingSecondsUndefined: Self = StObject.set(x, "estimatedTimeRemainingSeconds", js.undefined)
    
    inline def setPercentDone(value: PercentDone): Self = StObject.set(x, "percentDone", value.asInstanceOf[js.Any])
    
    inline def setPercentDoneUndefined: Self = StObject.set(x, "percentDone", js.undefined)
    
    inline def setTargetResource(value: GenericString): Self = StObject.set(x, "targetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "targetResource", js.undefined)
  }
}
