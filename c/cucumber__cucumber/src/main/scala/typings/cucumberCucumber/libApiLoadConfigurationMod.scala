package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.ILoadConfigurationOptions
import typings.cucumberCucumber.libApiTypesMod.IResolvedConfiguration
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiLoadConfigurationMod {
  
  @JSImport("@cucumber/cucumber/lib/api/load_configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfiguration(): js.Promise[IResolvedConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")().asInstanceOf[js.Promise[IResolvedConfiguration]]
  inline def loadConfiguration(options: Unit, environment: IRunEnvironment): js.Promise[IResolvedConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IResolvedConfiguration]]
  inline def loadConfiguration(options: ILoadConfigurationOptions): js.Promise[IResolvedConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResolvedConfiguration]]
  inline def loadConfiguration(options: ILoadConfigurationOptions, environment: IRunEnvironment): js.Promise[IResolvedConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IResolvedConfiguration]]
}
