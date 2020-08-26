package typings.chrome.anon

import typings.chrome.chrome.declarativeContent.PageStateMatcherProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actions extends js.Object {
  var actions: js.UndefOr[js.Array[Type]] = js.native
  var conditions: js.UndefOr[js.Array[PageStateMatcherProperties]] = js.native
  var event: js.UndefOr[String] = js.native
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
    def setActionsVarargs(value: Type*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Type]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: PageStateMatcherProperties*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[PageStateMatcherProperties]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
  
}

