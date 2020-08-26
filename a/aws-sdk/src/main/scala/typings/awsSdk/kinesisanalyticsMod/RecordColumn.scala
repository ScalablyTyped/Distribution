package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordColumn extends js.Object {
  /**
    * Reference to the data element in the streaming input or the reference data source. This element is required if the RecordFormatType is JSON.
    */
  var Mapping: js.UndefOr[RecordColumnMapping] = js.native
  /**
    * Name of the column created in the in-application input stream or reference table.
    */
  var Name: RecordColumnName = js.native
  /**
    * Type of column created in the in-application input stream or reference table.
    */
  var SqlType: RecordColumnSqlType = js.native
}

object RecordColumn {
  @scala.inline
  def apply(Name: RecordColumnName, SqlType: RecordColumnSqlType): RecordColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SqlType = SqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordColumn]
  }
  @scala.inline
  implicit class RecordColumnOps[Self <: RecordColumn] (val x: Self) extends AnyVal {
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
    def setName(value: RecordColumnName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSqlType(value: RecordColumnSqlType): Self = this.set("SqlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapping(value: RecordColumnMapping): Self = this.set("Mapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapping: Self = this.set("Mapping", js.undefined)
  }
  
}

