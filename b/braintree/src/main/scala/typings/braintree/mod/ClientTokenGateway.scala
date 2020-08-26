package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientTokenGateway extends js.Object {
  def generate(request: ClientTokenRequest): js.Promise[ValidatedResponse[ClientToken]] = js.native
}

object ClientTokenGateway {
  @scala.inline
  def apply(generate: ClientTokenRequest => js.Promise[ValidatedResponse[ClientToken]]): ClientTokenGateway = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
    __obj.asInstanceOf[ClientTokenGateway]
  }
  @scala.inline
  implicit class ClientTokenGatewayOps[Self <: ClientTokenGateway] (val x: Self) extends AnyVal {
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
    def setGenerate(value: ClientTokenRequest => js.Promise[ValidatedResponse[ClientToken]]): Self = this.set("generate", js.Any.fromFunction1(value))
  }
  
}

