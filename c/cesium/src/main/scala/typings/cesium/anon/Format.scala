package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var format: String
  var request: String
  var service: String
  var styles: String
  var version: String
}

object Format {
  @scala.inline
  def apply(format: String, request: String, service: String, styles: String, version: String): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

