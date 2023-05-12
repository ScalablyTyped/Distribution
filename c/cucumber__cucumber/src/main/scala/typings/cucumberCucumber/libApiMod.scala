package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.ILoadConfigurationOptions
import typings.cucumberCucumber.libApiTypesMod.ILoadSourcesResult
import typings.cucumberCucumber.libApiTypesMod.ILoadSupportOptions
import typings.cucumberCucumber.libApiTypesMod.IResolvedConfiguration
import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunOptions
import typings.cucumberCucumber.libApiTypesMod.IRunResult
import typings.cucumberCucumber.libApiTypesMod.ISourcesCoordinates
import typings.cucumberCucumber.libSupportCodeLibraryBuilderTypesMod.ISupportCodeLibrary
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiMod {
  
  @JSImport("@cucumber/cucumber/lib/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfiguration(): js.Promise[IResolvedConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")().asInstanceOf[js.Promise[IResolvedConfiguration]]
  inline def loadConfiguration(options: Unit, environment: IRunEnvironment): js.Promise[IResolvedConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IResolvedConfiguration]]
  inline def loadConfiguration(options: ILoadConfigurationOptions): js.Promise[IResolvedConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResolvedConfiguration]]
  inline def loadConfiguration(options: ILoadConfigurationOptions, environment: IRunEnvironment): js.Promise[IResolvedConfiguration] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfiguration")(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IResolvedConfiguration]]
  
  inline def loadSources(coordinates: ISourcesCoordinates): js.Promise[ILoadSourcesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSources")(coordinates.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ILoadSourcesResult]]
  inline def loadSources(coordinates: ISourcesCoordinates, environment: IRunEnvironment): js.Promise[ILoadSourcesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSources")(coordinates.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ILoadSourcesResult]]
  
  inline def loadSupport(options: ILoadSupportOptions): js.Promise[ISupportCodeLibrary] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSupport")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISupportCodeLibrary]]
  inline def loadSupport(options: ILoadSupportOptions, environment: IRunEnvironment): js.Promise[ISupportCodeLibrary] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadSupport")(options.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ISupportCodeLibrary]]
  
  inline def runCucumber(configuration: IRunOptions): js.Promise[IRunResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("runCucumber")(configuration.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IRunResult]]
  inline def runCucumber(
    configuration: IRunOptions,
    environment: Unit,
    onMessage: js.Function1[/* message */ Envelope, Unit]
  ): js.Promise[IRunResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCucumber")(configuration.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], onMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IRunResult]]
  inline def runCucumber(configuration: IRunOptions, environment: IRunEnvironment): js.Promise[IRunResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCucumber")(configuration.asInstanceOf[js.Any], environment.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IRunResult]]
  inline def runCucumber(
    configuration: IRunOptions,
    environment: IRunEnvironment,
    onMessage: js.Function1[/* message */ Envelope, Unit]
  ): js.Promise[IRunResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCucumber")(configuration.asInstanceOf[js.Any], environment.asInstanceOf[js.Any], onMessage.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IRunResult]]
}
