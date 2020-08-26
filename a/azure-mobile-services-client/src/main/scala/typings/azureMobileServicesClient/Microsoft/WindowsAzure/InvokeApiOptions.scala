package typings.azureMobileServicesClient.Microsoft.WindowsAzure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvokeApiOptions extends js.Object {
  var body: js.UndefOr[js.Any] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var method: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[js.Object] = js.native
}

object InvokeApiOptions {
  @scala.inline
  def apply(): InvokeApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeApiOptions]
  }
  @scala.inline
  implicit class InvokeApiOptionsOps[Self <: InvokeApiOptions] (val x: Self) extends AnyVal {
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
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setParameters(value: js.Object): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

