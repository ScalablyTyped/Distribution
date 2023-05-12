package typings.azureMsalBrowser

import typings.azureMsalBrowser.distConfigConfigurationMod.CryptoOptions
import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typings.azureMsalCommon.mod.Logger
import typings.azureMsalCommon.mod.PerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTelemetryBrowserPerformanceClientMod {
  
  @JSImport("@azure/msal-browser/dist/telemetry/BrowserPerformanceClient", "BrowserPerformanceClient")
  @js.native
  open class BrowserPerformanceClient protected () extends PerformanceClient {
    def this(
      clientId: String,
      authority: String,
      logger: Logger,
      libraryName: String,
      libraryVersion: String,
      applicationTelemetry: ApplicationTelemetry,
      cryptoOptions: CryptoOptions
    ) = this()
    
    /* private */ var browserCrypto: Any = js.native
    
    /* private */ var deleteIncompleteSubMeasurements: Any = js.native
    
    /* private */ var getPageVisibility: Any = js.native
    
    /* private */ var guidGenerator: Any = js.native
    
    def supportsBrowserPerformanceNow(): Boolean = js.native
  }
}
