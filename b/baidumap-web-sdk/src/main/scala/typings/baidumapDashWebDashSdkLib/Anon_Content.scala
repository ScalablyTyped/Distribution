package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Any
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(content: js.Any, target: js.Any, `type`: java.lang.String): Anon_Content = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Content]
  }
}

