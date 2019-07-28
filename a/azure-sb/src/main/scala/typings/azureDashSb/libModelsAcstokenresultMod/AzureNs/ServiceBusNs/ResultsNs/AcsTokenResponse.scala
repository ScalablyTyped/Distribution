package typings.azureDashSb.libModelsAcstokenresultMod.AzureNs.ServiceBusNs.ResultsNs

import org.scalablytyped.runtime.StringDictionary
import typings.azureDashSb.azureDashSbMod.AzureNs.ServiceBusNs.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcsTokenResponse extends Dictionary[String | Dictionary[String]] {
  var WrapAccessToken: Dictionary[String]
  var WrapAccessTokenExpiresIn: Dictionary[String]
}

object AcsTokenResponse {
  @scala.inline
  def apply(
    WrapAccessToken: Dictionary[String],
    WrapAccessTokenExpiresIn: Dictionary[String],
    StringDictionary: StringDictionary[String | Dictionary[String]] = null
  ): AcsTokenResponse = {
    val __obj = js.Dynamic.literal(WrapAccessToken = WrapAccessToken, WrapAccessTokenExpiresIn = WrapAccessTokenExpiresIn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AcsTokenResponse]
  }
}

