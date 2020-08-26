package typings.azureSb.wnsserviceMod

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var headers: Dictionary[String] = js.native
}

object Options {
  @scala.inline
  def apply(headers: Dictionary[String]): Options = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setHeaders(value: Dictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
  
}

