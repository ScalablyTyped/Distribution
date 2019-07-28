package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Case extends js.Object {
  var file: String
  var standard: String
  var success: Boolean
  var `type`: String
  var values: CaseValues
}

object Case {
  @scala.inline
  def apply(file: String, standard: String, success: Boolean, `type`: String, values: CaseValues): Case = {
    val __obj = js.Dynamic.literal(file = file, standard = standard, success = success, values = values)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Case]
  }
}

