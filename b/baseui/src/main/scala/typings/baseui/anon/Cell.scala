package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cell extends js.Object {
  var Cell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object Cell {
  @scala.inline
  def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  @scala.inline
  implicit class CellOps[Self <: Cell] (val x: Self) extends AnyVal {
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
    def setCell(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Cell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCell: Self = this.set("Cell", js.undefined)
  }
  
}

