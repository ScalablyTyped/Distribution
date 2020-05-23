package typings.awsServerlessExpress.middlewareMod.httpAugmentingMod

import typings.awsServerlessExpress.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingMessage extends js.Object {
  var apiGateway: js.UndefOr[Context] = js.undefined
}

object IncomingMessage {
  @scala.inline
  def apply(apiGateway: Context = null): IncomingMessage = {
    val __obj = js.Dynamic.literal()
    if (apiGateway != null) __obj.updateDynamic("apiGateway")(apiGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingMessage]
  }
}

