package typings.baidumapDashWebDashSdk

import typings.baidumapDashWebDashSdk.BMapNs.Size
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
    val __obj = js.Dynamic.literal(size = size, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Size]
  }
}

