package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentApplicationConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn
  
  /**
    * The version of the application.
    */
  var applicationVersion: DeploymentVersion
  
  /**
    * The launch configuration.
    */
  var launchConfig: DeploymentLaunchConfig
}
object DeploymentApplicationConfig {
  
  inline def apply(application: Arn, applicationVersion: DeploymentVersion, launchConfig: DeploymentLaunchConfig): DeploymentApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], applicationVersion = applicationVersion.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentApplicationConfig]
  }
  
  extension [Self <: DeploymentApplicationConfig](x: Self) {
    
    inline def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersion(value: DeploymentVersion): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfig(value: DeploymentLaunchConfig): Self = StObject.set(x, "launchConfig", value.asInstanceOf[js.Any])
  }
}
