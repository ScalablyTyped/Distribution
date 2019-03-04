package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: js.Any
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Item {
  @scala.inline
  def apply(item: js.Any, target: js.Any, `type`: java.lang.String): Anon_Item = {
    val __obj = js.Dynamic.literal(item = item, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Item]
  }
}

