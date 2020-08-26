package typings.azureSb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _empty extends js.Object {
  @JSName("_")
  var _underscore: Id = js.native
}

object _empty {
  @scala.inline
  def apply(_underscore: Id): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_underscore(value: Id): Self = this.set("_", value.asInstanceOf[js.Any])
  }
  
}

