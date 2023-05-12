package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.libConfigurationTypesMod.IConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResolvedConfiguration extends StObject {
  
  /**
    * The format that can be passed into `runCucumber`.
    */
  var runConfiguration: IRunConfiguration
  
  /**
    * The final flat configuration object resolved from the configuration file/profiles plus any extra provided.
    */
  var useConfiguration: IConfiguration
}
object IResolvedConfiguration {
  
  inline def apply(runConfiguration: IRunConfiguration, useConfiguration: IConfiguration): IResolvedConfiguration = {
    val __obj = js.Dynamic.literal(runConfiguration = runConfiguration.asInstanceOf[js.Any], useConfiguration = useConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResolvedConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResolvedConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRunConfiguration(value: IRunConfiguration): Self = StObject.set(x, "runConfiguration", value.asInstanceOf[js.Any])
    
    inline def setUseConfiguration(value: IConfiguration): Self = StObject.set(x, "useConfiguration", value.asInstanceOf[js.Any])
  }
}
