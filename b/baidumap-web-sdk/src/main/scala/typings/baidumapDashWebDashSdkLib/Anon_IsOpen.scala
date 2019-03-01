package typings
package baidumapDashWebDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsOpen extends js.Object {
  var isOpen: scala.Boolean
  var target: js.Any
  var `type`: java.lang.String
}

object Anon_IsOpen {
  @scala.inline
  def apply(isOpen: scala.Boolean, target: js.Any, `type`: java.lang.String): Anon_IsOpen = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("isOpen")(isOpen)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_IsOpen]
  }
}

