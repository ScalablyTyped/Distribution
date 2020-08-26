package typings.chrome.anon

import typings.chrome.chrome.scriptBadge.AttentionDetails
import typings.chrome.chrome.scriptBadge.GetPopupDetails
import typings.chrome.chrome.scriptBadge.ScriptBadgeClickedEvent
import typings.chrome.chrome.scriptBadge.SetPopupDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofscriptBadge extends js.Object {
  var onClicked: ScriptBadgeClickedEvent = js.native
  def getAttention(details: AttentionDetails): Unit = js.native
  def getPopup(details: GetPopupDetails, callback: js.Function): Unit = js.native
  def setPopup(details: SetPopupDetails): Unit = js.native
}

object TypeofscriptBadge {
  @scala.inline
  def apply(
    getAttention: AttentionDetails => Unit,
    getPopup: (GetPopupDetails, js.Function) => Unit,
    onClicked: ScriptBadgeClickedEvent,
    setPopup: SetPopupDetails => Unit
  ): TypeofscriptBadge = {
    val __obj = js.Dynamic.literal(getAttention = js.Any.fromFunction1(getAttention), getPopup = js.Any.fromFunction2(getPopup), onClicked = onClicked.asInstanceOf[js.Any], setPopup = js.Any.fromFunction1(setPopup))
    __obj.asInstanceOf[TypeofscriptBadge]
  }
  @scala.inline
  implicit class TypeofscriptBadgeOps[Self <: TypeofscriptBadge] (val x: Self) extends AnyVal {
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
    def setGetAttention(value: AttentionDetails => Unit): Self = this.set("getAttention", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPopup(value: (GetPopupDetails, js.Function) => Unit): Self = this.set("getPopup", js.Any.fromFunction2(value))
    @scala.inline
    def setOnClicked(value: ScriptBadgeClickedEvent): Self = this.set("onClicked", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPopup(value: SetPopupDetails => Unit): Self = this.set("setPopup", js.Any.fromFunction1(value))
  }
  
}

