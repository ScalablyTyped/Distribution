package typings.chrome.anon

import typings.chrome.chrome.declarativeWebRequest.RequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdeclarativeWebReque extends js.Object {
  var onRequest: RequestedEvent = js.native
}

object TypeofdeclarativeWebReque {
  @scala.inline
  def apply(onRequest: RequestedEvent): TypeofdeclarativeWebReque = {
    val __obj = js.Dynamic.literal(onRequest = onRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeWebReque]
  }
  @scala.inline
  implicit class TypeofdeclarativeWebRequeOps[Self <: TypeofdeclarativeWebReque] (val x: Self) extends AnyVal {
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
    def setOnRequest(value: RequestedEvent): Self = this.set("onRequest", value.asInstanceOf[js.Any])
  }
  
}

