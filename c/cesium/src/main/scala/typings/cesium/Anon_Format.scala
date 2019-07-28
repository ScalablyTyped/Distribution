package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: String
  var request: String
  var service: String
  var styles: String
  var version: String
}

object Anon_Format {
  @scala.inline
  def apply(format: String, request: String, service: String, styles: String, version: String): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format, request = request, service = service, styles = styles, version = version)
  
    __obj.asInstanceOf[Anon_Format]
  }
}

