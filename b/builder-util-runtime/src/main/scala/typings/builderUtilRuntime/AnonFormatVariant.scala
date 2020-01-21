package typings.builderUtilRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormatVariant extends js.Object {
  var format: String
  var variant: String
  var version: Double
}

object AnonFormatVariant {
  @scala.inline
  def apply(format: String, variant: String, version: Double): AnonFormatVariant = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFormatVariant]
  }
}

