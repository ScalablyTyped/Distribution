package typings.bugsnagJs.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISession extends js.Object {
  var id: String = js.native
  var startedAt: String = js.native
  var user: js.UndefOr[js.Object] = js.native
}

object ISession {
  @scala.inline
  def apply(id: String, startedAt: String): ISession = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISession]
  }
  @scala.inline
  implicit class ISessionOps[Self <: ISession] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: String): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: js.Object): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

