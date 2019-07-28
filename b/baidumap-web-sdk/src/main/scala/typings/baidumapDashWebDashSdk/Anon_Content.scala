package typings.baidumapDashWebDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Any
  var target: js.Any
  var `type`: String
}

object Anon_Content {
  @scala.inline
  def apply(content: js.Any, target: js.Any, `type`: String): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Content]
  }
}

