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
  def apply(
    BucketColumns: NameStringList = null,
    Columns: ColumnList = null,
    Compressed: js.UndefOr[Boolean] = js.undefined,
    InputFormat: FormatString = null,
    Location: LocationString = null,
    NumberOfBuckets: js.UndefOr[Integer] = js.undefined,
    OutputFormat: FormatString = null,
    Parameters: ParametersMap = null,
    SerdeInfo: SerDeInfo = null,
    SkewedInfo: SkewedInfo = null,
    SortColumns: OrderList = null,
    StoredAsSubDirectories: js.UndefOr[Boolean] = js.undefined
  ): StorageDescriptor = {
    val __obj = js.Dynamic.literal()
    if (BucketColumns != null) __obj.updateDynamic("BucketColumns")(BucketColumns.asInstanceOf[js.Any])
    if (Columns != null) __obj.updateDynamic("Columns")(Columns.asInstanceOf[js.Any])
    if (!js.isUndefined(Compressed)) __obj.updateDynamic("Compressed")(Compressed.get.asInstanceOf[js.Any])
    if (InputFormat != null) __obj.updateDynamic("InputFormat")(InputFormat.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfBuckets)) __obj.updateDynamic("NumberOfBuckets")(NumberOfBuckets.get.asInstanceOf[js.Any])
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (SerdeInfo != null) __obj.updateDynamic("SerdeInfo")(SerdeInfo.asInstanceOf[js.Any])
    if (SkewedInfo != null) __obj.updateDynamic("SkewedInfo")(SkewedInfo.asInstanceOf[js.Any])
    if (SortColumns != null) __obj.updateDynamic("SortColumns")(SortColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(StoredAsSubDirectories)) __obj.updateDynamic("StoredAsSubDirectories")(StoredAsSubDirectories.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageDescriptor]
  }
}

