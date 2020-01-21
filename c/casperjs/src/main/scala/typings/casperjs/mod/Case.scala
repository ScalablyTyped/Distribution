package typings.casperjs.mod

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
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Case]
  }
}

