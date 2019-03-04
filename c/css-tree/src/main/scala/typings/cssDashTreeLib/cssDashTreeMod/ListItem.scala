package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem[TData] extends js.Object {
  var data: TData
  var next: ListItem[TData] | scala.Null
  var prev: ListItem[TData] | scala.Null
}

object ListItem {
  @scala.inline
  def apply[TData](data: TData, next: ListItem[TData] = null, prev: ListItem[TData] = null): ListItem[TData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[ListItem[TData]]
  }
}

