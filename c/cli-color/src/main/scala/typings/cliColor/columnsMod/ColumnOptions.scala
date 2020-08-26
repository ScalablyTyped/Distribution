package typings.cliColor.columnsMod

import typings.cliColor.cliColorStrings.left
import typings.cliColor.cliColorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnOptions extends js.Object {
  /**
    * align: Possible options: `'left'`, `'right'` (defaults to `'left'`)
    */
  var align: js.UndefOr[left | right] = js.native
}

object ColumnOptions {
  @scala.inline
  def apply(): ColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnOptions]
  }
  @scala.inline
  implicit class ColumnOptionsOps[Self <: ColumnOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: left | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
  
}

