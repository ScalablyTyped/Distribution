package typings.cesium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: String
  var request: String
  var service: String
  var styles: String
  var version: String
}

object AnonFormat {
  @scala.inline
  def apply(format: String, request: String, service: String, styles: String, version: String): AnonFormat = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

