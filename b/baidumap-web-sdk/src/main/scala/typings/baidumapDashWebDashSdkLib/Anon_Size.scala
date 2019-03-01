package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Size extends js.Object {
  var size: baidumapDashWebDashSdkLib.BMapNs.Size
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Size {
  @scala.inline
  def apply(size: baidumapDashWebDashSdkLib.BMapNs.Size, target: js.Any, `type`: java.lang.String): Anon_Size = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Size]
  }
}

