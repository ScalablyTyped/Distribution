package typings.azureMsalCommon.mod

import typings.azureMsalCommon.clientConfigurationMod.ClientConfiguration
import typings.azureMsalCommon.iperformanceclientMod.IPerformanceClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "SilentFlowClient")
@js.native
open class SilentFlowClient protected ()
  extends typings.azureMsalCommon.silentFlowClientMod.SilentFlowClient {
  def this(configuration: ClientConfiguration) = this()
  def this(configuration: ClientConfiguration, performanceClient: IPerformanceClient) = this()
}
