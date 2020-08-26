package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackParameterName extends js.Object {
  var callbackParameterName: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Any] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
}

object CallbackParameterName {
  @scala.inline
  def apply(): CallbackParameterName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackParameterName]
  }
  @scala.inline
  implicit class CallbackParameterNameOps[Self <: CallbackParameterName] (val x: Self) extends AnyVal {
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
    def setCallbackParameterName(value: String): Self = this.set("callbackParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackParameterName: Self = this.set("callbackParameterName", js.undefined)
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
  
}

