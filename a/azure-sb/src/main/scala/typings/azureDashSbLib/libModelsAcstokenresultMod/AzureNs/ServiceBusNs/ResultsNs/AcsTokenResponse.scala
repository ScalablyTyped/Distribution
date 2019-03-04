package typings
package azureDashSbLib.libModelsAcstokenresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcsTokenResponse
  extends azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[
      java.lang.String | azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
    ] {
  var WrapAccessToken: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
  var WrapAccessTokenExpiresIn: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
}

object AcsTokenResponse {
  @scala.inline
  def apply(
    WrapAccessToken: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String],
    WrapAccessTokenExpiresIn: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
  ): AcsTokenResponse = {
    val __obj = js.Dynamic.literal(WrapAccessToken = WrapAccessToken, WrapAccessTokenExpiresIn = WrapAccessTokenExpiresIn)
  
    __obj.asInstanceOf[AcsTokenResponse]
  }
}

