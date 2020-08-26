package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISessionDelegate extends js.Object {
  def startSession(client: Client): Client = js.native
}

object ISessionDelegate {
  @scala.inline
  def apply(startSession: Client => Client): ISessionDelegate = {
    val __obj = js.Dynamic.literal(startSession = js.Any.fromFunction1(startSession))
    __obj.asInstanceOf[ISessionDelegate]
  }
  @scala.inline
  implicit class ISessionDelegateOps[Self <: ISessionDelegate] (val x: Self) extends AnyVal {
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
    def setStartSession(value: Client => Client): Self = this.set("startSession", js.Any.fromFunction1(value))
  }
  
}

