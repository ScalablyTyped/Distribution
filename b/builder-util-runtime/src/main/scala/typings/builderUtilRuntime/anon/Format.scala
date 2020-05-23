package typings.builderUtilRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: String
  var variant: String
  var version: js.UndefOr[scala.Nothing] = js.undefined
}

object Format {
  @scala.inline
  def apply(format: String, variant: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

