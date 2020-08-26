package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageDescriptor extends js.Object {
  /**
    * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
    */
  var BucketColumns: js.UndefOr[NameStringList] = js.native
  /**
    * A list of the Columns in the table.
    */
  var Columns: js.UndefOr[ColumnList] = js.native
  /**
    *  True if the data in the table is compressed, or False if not.
    */
  var Compressed: js.UndefOr[Boolean] = js.native
  /**
    * The input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
    */
  var InputFormat: js.UndefOr[FormatString] = js.native
  /**
    * The physical location of the table. By default, this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
    */
  var Location: js.UndefOr[LocationString] = js.native
  /**
    * Must be specified if the table contains any dimension columns.
    */
  var NumberOfBuckets: js.UndefOr[Integer] = js.native
  /**
    * The output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
    */
  var OutputFormat: js.UndefOr[FormatString] = js.native
  /**
    * The user-supplied properties in key-value form.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * The serialization/deserialization (SerDe) information.
    */
  var SerdeInfo: js.UndefOr[SerDeInfo] = js.native
  /**
    * The information about values that appear frequently in a column (skewed values).
    */
  var SkewedInfo: js.UndefOr[typings.awsSdk.glueMod.SkewedInfo] = js.native
  /**
    * A list specifying the sort order of each bucket in the table.
    */
  var SortColumns: js.UndefOr[OrderList] = js.native
  /**
    *  True if the table data is stored in subdirectories, or False if not.
    */
  var StoredAsSubDirectories: js.UndefOr[Boolean] = js.native
}

object StorageDescriptor {
  @scala.inline
  def apply(): StorageDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageDescriptor]
  }
  @scala.inline
  implicit class StorageDescriptorOps[Self <: StorageDescriptor] (val x: Self) extends AnyVal {
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
    def setBucketColumnsVarargs(value: NameString*): Self = this.set("BucketColumns", js.Array(value :_*))
    @scala.inline
    def setBucketColumns(value: NameStringList): Self = this.set("BucketColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketColumns: Self = this.set("BucketColumns", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("Columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: ColumnList): Self = this.set("Columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("Columns", js.undefined)
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("Compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressed: Self = this.set("Compressed", js.undefined)
    @scala.inline
    def setInputFormat(value: FormatString): Self = this.set("InputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputFormat: Self = this.set("InputFormat", js.undefined)
    @scala.inline
    def setLocation(value: LocationString): Self = this.set("Location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    @scala.inline
    def setNumberOfBuckets(value: Integer): Self = this.set("NumberOfBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfBuckets: Self = this.set("NumberOfBuckets", js.undefined)
    @scala.inline
    def setOutputFormat(value: FormatString): Self = this.set("OutputFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputFormat: Self = this.set("OutputFormat", js.undefined)
    @scala.inline
    def setParameters(value: ParametersMap): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setSerdeInfo(value: SerDeInfo): Self = this.set("SerdeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerdeInfo: Self = this.set("SerdeInfo", js.undefined)
    @scala.inline
    def setSkewedInfo(value: SkewedInfo): Self = this.set("SkewedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewedInfo: Self = this.set("SkewedInfo", js.undefined)
    @scala.inline
    def setSortColumnsVarargs(value: Order*): Self = this.set("SortColumns", js.Array(value :_*))
    @scala.inline
    def setSortColumns(value: OrderList): Self = this.set("SortColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumns: Self = this.set("SortColumns", js.undefined)
    @scala.inline
    def setStoredAsSubDirectories(value: Boolean): Self = this.set("StoredAsSubDirectories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoredAsSubDirectories: Self = this.set("StoredAsSubDirectories", js.undefined)
  }
  
}

