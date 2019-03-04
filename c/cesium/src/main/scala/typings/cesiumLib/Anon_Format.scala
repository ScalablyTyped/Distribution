package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: java.lang.String
  var request: java.lang.String
  var service: java.lang.String
  var styles: java.lang.String
  var version: java.lang.String
}

object Anon_Format {
  @scala.inline
  def apply(
    format: java.lang.String,
    request: java.lang.String,
    service: java.lang.String,
    styles: java.lang.String,
    version: java.lang.String
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format, request = request, service = service, styles = styles, version = version)
  
    __obj.asInstanceOf[Anon_Format]
  }
}

