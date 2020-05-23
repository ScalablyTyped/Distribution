package typings.carbone.mod

import typings.carbone.anon.Rates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterContext extends js.Object {
  var currency: Rates
  var enum: Enums
  var extension: String
  var lang: String
  var stopPropagation: Boolean
}

object FormatterContext {
  @scala.inline
  def apply(currency: Rates, enum: Enums, extension: String, lang: String, stopPropagation: Boolean): FormatterContext = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterContext]
  }
}

