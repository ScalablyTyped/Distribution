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
    WrapAccessTokenExpiresIn: azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String],
    StringDictionary: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | azureDashSbLib.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary[java.lang.String]
    ] = null
  ): AcsTokenResponse = {
    val __obj = js.Dynamic.literal(WrapAccessToken = WrapAccessToken, WrapAccessTokenExpiresIn = WrapAccessTokenExpiresIn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AcsTokenResponse]
  }
}

