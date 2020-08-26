package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaColumn extends js.Object {
  /**
    * The type of data in the column.
    */
  var DataType: js.UndefOr[ColumnTypeString] = js.native
  /**
    * The name of the column.
    */
  var Name: js.UndefOr[ColumnNameString] = js.native
}

object SchemaColumn {
  @scala.inline
  def apply(): SchemaColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaColumn]
  }
  @scala.inline
  implicit class SchemaColumnOps[Self <: SchemaColumn] (val x: Self) extends AnyVal {
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
    def setDataType(value: ColumnTypeString): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    @scala.inline
    def setName(value: ColumnNameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

