package typings.builderUtilRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variant extends js.Object {
  var format: String
  var variant: String
  var version: Double
}

object Variant {
  @scala.inline
  def apply(format: String, variant: String, version: Double): Variant = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variant]
  }
}

