package typings
package azureDashSbLib.libModelsAcstokenresultMod.AzureNs.ServiceBusNs.ResultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcsTokenResult extends js.Object {
  def parse(acsTokenQueryString: java.lang.String): AcsTokenResponse
}

object AcsTokenResult {
  @scala.inline
  def apply(parse: java.lang.String => AcsTokenResponse): AcsTokenResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[AcsTokenResult]
  }
}

