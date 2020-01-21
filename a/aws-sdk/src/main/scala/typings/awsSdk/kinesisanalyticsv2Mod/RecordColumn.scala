package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordColumn extends js.Object {
  /**
    * A reference to the data element in the streaming input or the reference data source.
    */
  var Mapping: js.UndefOr[RecordColumnMapping] = js.native
  /**
    * The name of the column that is created in the in-application input stream or reference table.
    */
  var Name: RecordColumnName = js.native
  /**
    * The type of column created in the in-application input stream or reference table.
    */
  var SqlType: RecordColumnSqlType = js.native
}

object RecordColumn {
  @scala.inline
  def apply(Name: RecordColumnName, SqlType: RecordColumnSqlType, Mapping: RecordColumnMapping = null): RecordColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SqlType = SqlType.asInstanceOf[js.Any])
    if (Mapping != null) __obj.updateDynamic("Mapping")(Mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordColumn]
  }
}

