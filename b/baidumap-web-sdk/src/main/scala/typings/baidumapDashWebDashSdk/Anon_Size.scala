package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  var size: Size
  var target: js.Any
  var `type`: String
}

object Anon_Size {
  @scala.inline
  def apply(size: Size, target: js.Any, `type`: String): Anon_Size = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Size]
  }
}

