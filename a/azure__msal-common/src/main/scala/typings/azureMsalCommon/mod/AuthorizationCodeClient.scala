package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.distTelemetryPerformanceIperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "AuthorizationCodeClient")
@js.native
open class AuthorizationCodeClient protected ()
  extends typings.azureMsalCommon.distClientAuthorizationCodeClientMod.AuthorizationCodeClient {
  def this(configuration: ClientConfiguration) = this()
  def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
}
