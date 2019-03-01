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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("standard")(standard)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Case]
  }
}

