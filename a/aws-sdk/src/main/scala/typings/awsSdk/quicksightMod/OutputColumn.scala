package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputColumn extends js.Object {
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ColumnName] = js.native
  /**
    * Type.
    */
  var Type: js.UndefOr[ColumnDataType] = js.native
}

object OutputColumn {
  @scala.inline
  def apply(): OutputColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputColumn]
  }
  @scala.inline
  implicit class OutputColumnOps[Self <: OutputColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: ColumnName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setType(value: ColumnDataType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

