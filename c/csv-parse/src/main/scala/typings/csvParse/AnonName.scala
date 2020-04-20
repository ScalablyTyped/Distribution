package typings.csvParse

import typings.csvParse.es5Mod._ColumnOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName
  extends _ColumnOption
     with typings.csvParse.mod._ColumnOption {
  var name: String
}

object AnonName {
  @scala.inline
  def apply(name: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

