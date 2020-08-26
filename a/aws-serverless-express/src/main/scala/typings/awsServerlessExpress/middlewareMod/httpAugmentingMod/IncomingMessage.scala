package typings.awsServerlessExpress.middlewareMod.httpAugmentingMod

import typings.awsServerlessExpress.anon.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage extends js.Object {
  var apiGateway: js.UndefOr[Context] = js.native
}

object IncomingMessage {
  @scala.inline
  def apply(): IncomingMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingMessage]
  }
  @scala.inline
  implicit class IncomingMessageOps[Self <: IncomingMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiGateway(value: Context): Self = this.set("apiGateway", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiGateway: Self = this.set("apiGateway", js.undefined)
  }
  
}

