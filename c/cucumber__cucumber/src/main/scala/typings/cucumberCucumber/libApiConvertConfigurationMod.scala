package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.IRunConfiguration
import typings.cucumberCucumber.libConfigurationTypesMod.IConfiguration
import typings.node.processMod.global.NodeJS.ProcessEnv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiConvertConfigurationMod {
  
  @JSImport("@cucumber/cucumber/lib/api/convert_configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertConfiguration(flatConfiguration: IConfiguration, env: ProcessEnv): js.Promise[IRunConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertConfiguration")(flatConfiguration.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IRunConfiguration]]
}
