package typings.awsServerlessExpress.middlewareMod.httpAugmentingMod

import typings.awsServerlessExpress.AnonBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var apiGateway: js.UndefOr[AnonBody] = js.undefined
}

object IncomingMessage {
  @scala.inline
  def apply(apiGateway: AnonBody = null): IncomingMessage = {
    val __obj = js.Dynamic.literal()
    if (apiGateway != null) __obj.updateDynamic("apiGateway")(apiGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
}

