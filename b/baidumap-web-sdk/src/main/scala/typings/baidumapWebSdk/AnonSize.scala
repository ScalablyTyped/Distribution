package typings.baidumapWebSdk

import typings.baidumapWebSdk.BMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var size: Size
  var target: js.Any
  var `type`: String
}

object AnonSize {
  @scala.inline
  def apply(size: Size, target: js.Any, `type`: String): AnonSize = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

