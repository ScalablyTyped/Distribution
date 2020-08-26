package typings.chocolatechipjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackName extends js.Object {
  /**
    * The optional name for the callback when the server response will execute.
    * The default value is "callback".
    * However some sites may use a different name for their JSONP function.
    * Consult the documentation on the site to ascertain the correct value for this callback.
    */
  var callbackName: js.UndefOr[String] = js.native
  /**
    * This value determines whether the callbacks and script associate with JSONP persist or are purged after the request returns. By default this is set to true, meaning that they will be purged.
    */
  var clear: js.UndefOr[Boolean] = js.native
  /**
    * A number representing milliseconds to express when to refect a JSONP request.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object CallbackName {
  @scala.inline
  def apply(): CallbackName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackName]
  }
  @scala.inline
  implicit class CallbackNameOps[Self <: CallbackName] (val x: Self) extends AnyVal {
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
    def setCallbackName(value: String): Self = this.set("callbackName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackName: Self = this.set("callbackName", js.undefined)
    @scala.inline
    def setClear(value: Boolean): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

