package typings.baseui.dataDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowT extends js.Object {
  var data: js.Any
  var id: Double | String
}

object RowT {
  @scala.inline
  def apply(data: js.Any, id: Double | String): RowT = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowT]
  }
}

