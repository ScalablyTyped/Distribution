package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Case extends js.Object {
  var file: java.lang.String
  var standard: java.lang.String
  var success: scala.Boolean
  var `type`: java.lang.String
  var values: CaseValues
}

object Case {
  @scala.inline
  def apply(
    file: java.lang.String,
    standard: java.lang.String,
    success: scala.Boolean,
    `type`: java.lang.String,
    values: CaseValues
  ): Case = {
    val __obj = js.Dynamic.literal(file = file, standard = standard, success = success, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Case]
  }
}

