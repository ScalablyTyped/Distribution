package typings.carbone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionFormat extends js.Object {
  var desc: String
  var extension: String
  var format: String
  var id: String
}

object ConversionFormat {
  @scala.inline
  def apply(desc: String, extension: String, format: String, id: String): ConversionFormat = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversionFormat]
  }
}

