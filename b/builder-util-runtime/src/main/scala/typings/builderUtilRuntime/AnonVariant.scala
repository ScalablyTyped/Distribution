package typings.builderUtilRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVariant extends js.Object {
  var format: String
  var variant: String
  var version: Double
}

object AnonVariant {
  @scala.inline
  def apply(format: String, variant: String, version: Double): AnonVariant = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVariant]
  }
}

