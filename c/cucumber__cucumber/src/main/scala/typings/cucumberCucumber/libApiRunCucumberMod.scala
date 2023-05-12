package typings.cucumberCucumber

import typings.cucumberCucumber.libApiTypesMod.IRunEnvironment
import typings.cucumberCucumber.libApiTypesMod.IRunOptions
import typings.cucumberCucumber.libApiTypesMod.IRunResult
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiRunCucumberMod {
  
  @JSImport("@cucumber/cucumber/lib/api/run_cucumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
