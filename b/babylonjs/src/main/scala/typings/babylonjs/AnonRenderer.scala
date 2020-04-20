package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderer extends js.Object {
  var renderer: String
  var vendor: String
  var version: String
}

object AnonRenderer {
  @scala.inline
  def apply(renderer: String, vendor: String, version: String): AnonRenderer = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRenderer]
  }
}

