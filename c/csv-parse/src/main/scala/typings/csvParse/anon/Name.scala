package typings.csvParse.anon

import typings.csvParse.es5Mod._ColumnOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name
  extends _ColumnOption
     with typings.csvParse.mod._ColumnOption {
  var name: String
}

object Name {
  @scala.inline
  def apply(name: String): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

