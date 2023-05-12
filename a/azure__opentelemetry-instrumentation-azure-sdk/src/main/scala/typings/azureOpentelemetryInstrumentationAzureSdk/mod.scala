package typings.azureOpentelemetryInstrumentationAzureSdk

import typings.azureLogger.mod.AzureLogger
import typings.opentelemetryInstrumentation.buildSrcTypesMod.Instrumentation
import typings.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@azure/opentelemetry-instrumentation-azure-sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAzureSdkInstrumentation(): Instrumentation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAzureSdkInstrumentation")().asInstanceOf[Instrumentation]
  inline def createAzureSdkInstrumentation(options: AzureSdkInstrumentationOptions): Instrumentation = ^.asInstanceOf[js.Dynamic].applyDynamic("createAzureSdkInstrumentation")(options.asInstanceOf[js.Any]).asInstanceOf[Instrumentation]
  
  @JSImport("@azure/opentelemetry-instrumentation-azure-sdk", "logger")
  @js.native
  val logger: AzureLogger = js.native
  
  type AzureSdkInstrumentationOptions = InstrumentationConfig
}
