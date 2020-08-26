package typings.chromeApps.anon

import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: js.UndefOr[js.Array[TypeDeclarativeWebRequestActionsList]] = js.native
  var conditions: js.UndefOr[js.Array[Dictkey]] = js.native
  /** Event name */
  var event: js.UndefOr[DeclarativeWebRequestEventList] = js.native
}

object Actions {
  @scala.inline
  def apply(): Actions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actions]
  }
  @scala.inline
  implicit class ActionsOps[Self <: Actions] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: TypeDeclarativeWebRequestActionsList*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[TypeDeclarativeWebRequestActionsList]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: Dictkey*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[Dictkey]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setEvent(value: DeclarativeWebRequestEventList): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

