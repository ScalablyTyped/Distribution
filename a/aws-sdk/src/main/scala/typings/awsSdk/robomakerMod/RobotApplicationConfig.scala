package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RobotApplicationConfig extends StObject {
  
  /**
    * The application information for the robot application.
    */
  var application: Arn
  
  /**
    * The version of the robot application.
    */
  var applicationVersion: js.UndefOr[Version] = js.undefined
  
  /**
    * The launch configuration for the robot application.
    */
  var launchConfig: LaunchConfig
}
object RobotApplicationConfig {
  
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig): RobotApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotApplicationConfig]
  }
  
  @scala.inline
  implicit class RobotApplicationConfigMutableBuilder[Self <: RobotApplicationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    @scala.inline
    def setLaunchConfig(value: LaunchConfig): Self = StObject.set(x, "launchConfig", value.asInstanceOf[js.Any])
  }
}
