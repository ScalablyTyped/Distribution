package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyCommand extends js.Object {
  /**
    * Optional parameters to use with the Amazon Redshift COPY command. For more information, see the "Optional Parameters" section of Amazon Redshift COPY command. Some possible examples that would apply to Kinesis Data Firehose are as follows:  delimiter '\t' lzop; - fields are delimited with "\t" (TAB character) and compressed using lzop.  delimiter '|' - fields are delimited with "|" (this is the default delimiter).  delimiter '|' escape - the delimiter should be escaped.  fixedwidth 'venueid:3,venuename:25,venuecity:12,venuestate:2,venueseats:6' - fields are fixed width in the source, with each width specified after every column in the table.  JSON 's3://mybucket/jsonpaths.txt' - data is in JSON format, and the path specified is the format of the data. For more examples, see Amazon Redshift COPY command examples.
    */
  var CopyOptions: js.UndefOr[typings.awsSdk.firehoseMod.CopyOptions] = js.native
  /**
    * A comma-separated list of column names.
    */
  var DataTableColumns: js.UndefOr[typings.awsSdk.firehoseMod.DataTableColumns] = js.native
  /**
    * The name of the target table. The table must already exist in the database.
    */
  var DataTableName: typings.awsSdk.firehoseMod.DataTableName = js.native
}

object CopyCommand {
  @scala.inline
  def apply(
    DataTableName: DataTableName,
    CopyOptions: CopyOptions = null,
    DataTableColumns: DataTableColumns = null
  ): CopyCommand = {
    val __obj = js.Dynamic.literal(DataTableName = DataTableName.asInstanceOf[js.Any])
    if (CopyOptions != null) __obj.updateDynamic("CopyOptions")(CopyOptions.asInstanceOf[js.Any])
    if (DataTableColumns != null) __obj.updateDynamic("DataTableColumns")(DataTableColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyCommand]
  }
}

