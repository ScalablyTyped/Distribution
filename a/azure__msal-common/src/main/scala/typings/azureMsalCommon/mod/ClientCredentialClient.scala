package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distConfigAppTokenProviderMod.IAppTokenProvider
import typings.azureMsalCommon.distConfigClientConfigurationMod.ClientConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ClientCredentialClient")
@js.native
open class ClientCredentialClient protected ()
  extends typings.azureMsalCommon.distClientClientCredentialClientMod.ClientCredentialClient {
  def this(configuration: ClientConfiguration) = this()
  def this(configuration: ClientConfiguration, appTokenProvider: IAppTokenProvider) = this()
}
