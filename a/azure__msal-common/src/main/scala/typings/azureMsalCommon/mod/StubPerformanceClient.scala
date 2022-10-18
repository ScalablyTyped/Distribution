package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "StubPerformanceClient")
@js.native
open class StubPerformanceClient protected ()
  extends typings.azureMsalCommon.distTelemetryPerformanceStubPerformanceClientMod.StubPerformanceClient {
  /**
    * Creates an instance of PerformanceClient,
    * an abstract class containing core performance telemetry logic.
    *
    * @constructor
    * @param {string} clientId Client ID of the application
    * @param {string} authority Authority used by the application
    * @param {Logger} logger Logger used by the application
    * @param {string} libraryName Name of the library
    * @param {string} libraryVersion Version of the library
    */
  def this(
    clientId: String,
    authority: String,
    logger: typings.azureMsalCommon.distLoggerLoggerMod.Logger,
    libraryName: String,
    libraryVersion: String,
    applicationTelemetry: ApplicationTelemetry
  ) = this()
}
