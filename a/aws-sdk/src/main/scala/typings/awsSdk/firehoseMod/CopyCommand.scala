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
  def apply(DataTableName: DataTableName): CopyCommand = {
    val __obj = js.Dynamic.literal(DataTableName = DataTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyCommand]
  }
  @scala.inline
  implicit class CopyCommandOps[Self <: CopyCommand] (val x: Self) extends AnyVal {
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
    def setDataTableName(value: DataTableName): Self = this.set("DataTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyOptions(value: CopyOptions): Self = this.set("CopyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyOptions: Self = this.set("CopyOptions", js.undefined)
    @scala.inline
    def setDataTableColumns(value: DataTableColumns): Self = this.set("DataTableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTableColumns: Self = this.set("DataTableColumns", js.undefined)
  }
  
}

