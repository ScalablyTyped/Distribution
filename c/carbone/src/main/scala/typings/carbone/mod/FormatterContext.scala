package typings.carbone.mod

import typings.carbone.anon.Rates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterContext extends js.Object {
  var currency: Rates = js.native
  var enum: Enums = js.native
  var extension: String = js.native
  var lang: String = js.native
  var stopPropagation: Boolean = js.native
}

object FormatterContext {
  @scala.inline
  def apply(currency: Rates, enum: Enums, extension: String, lang: String, stopPropagation: Boolean): FormatterContext = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterContext]
  }
  @scala.inline
  implicit class FormatterContextOps[Self <: FormatterContext] (val x: Self) extends AnyVal {
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
    def setCurrency(value: Rates): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnum(value: Enums): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
  }
  
}

