package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInfo extends js.Object {
  var code: Double
  var info: js.Any
}

object AnonInfo {
  @scala.inline
  def apply(code: Double, info: js.Any): AnonInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInfo]
  }
}

