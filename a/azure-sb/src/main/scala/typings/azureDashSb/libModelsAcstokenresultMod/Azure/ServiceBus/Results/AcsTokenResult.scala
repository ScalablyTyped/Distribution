package typings.azureDashSb.libModelsAcstokenresultMod.Azure.ServiceBus.Results

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcsTokenResult extends js.Object {
  def parse(acsTokenQueryString: String): AcsTokenResponse
}

object AcsTokenResult {
  @scala.inline
  def apply(parse: String => AcsTokenResponse): AcsTokenResult = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
  
    __obj.asInstanceOf[AcsTokenResult]
  }
}

