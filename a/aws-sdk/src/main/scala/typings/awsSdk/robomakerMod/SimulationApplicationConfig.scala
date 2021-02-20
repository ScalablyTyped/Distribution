package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationApplicationConfig extends StObject {
  
  /**
    * The application information for the simulation application.
    */
  var application: Arn = js.native
  
  /**
    * The version of the simulation application.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
  
  /**
    * The launch configuration for the simulation application.
    */
  var launchConfig: LaunchConfig = js.native
  
  /**
    * A list of world configurations.
    */
  var worldConfigs: js.UndefOr[WorldConfigs] = js.native
}
object SimulationApplicationConfig {
  
  @scala.inline
  def apply(application: Arn, launchConfig: LaunchConfig): SimulationApplicationConfig = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], launchConfig = launchConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationApplicationConfig]
  }
  
  @scala.inline
  implicit class SimulationApplicationConfigMutableBuilder[Self <: SimulationApplicationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Arn): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersion(value: Version): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
    
    @scala.inline
    def setLaunchConfig(value: LaunchConfig): Self = StObject.set(x, "launchConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldConfigs(value: WorldConfigs): Self = StObject.set(x, "worldConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldConfigsUndefined: Self = StObject.set(x, "worldConfigs", js.undefined)
    
    @scala.inline
    def setWorldConfigsVarargs(value: WorldConfig*): Self = StObject.set(x, "worldConfigs", js.Array(value :_*))
  }
}
