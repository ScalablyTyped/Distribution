package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fromitem extends js.Object {
  var fromitem: js.Any
  var target: js.Any
  var toitem: js.Any
  var `type`: java.lang.String
}

object Anon_Fromitem {
  @scala.inline
  def apply(fromitem: js.Any, target: js.Any, toitem: js.Any, `type`: java.lang.String): Anon_Fromitem = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fromitem")(fromitem)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("toitem")(toitem)
    __obj.asInstanceOf[Anon_Fromitem]
  }
}

