package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid extends js.Object {
  var Grid: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object Grid {
  @scala.inline
  def apply(): Grid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grid]
  }
  @scala.inline
  implicit class GridOps[Self <: Grid] (val x: Self) extends AnyVal {
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
    def setGrid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("Grid", js.undefined)
  }
  
}

