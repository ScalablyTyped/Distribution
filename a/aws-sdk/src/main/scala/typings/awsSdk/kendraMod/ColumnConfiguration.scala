package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnConfiguration extends js.Object {
  /**
    * One to five columns that indicate when a document in the database has changed.
    */
  var ChangeDetectingColumns: typings.awsSdk.kendraMod.ChangeDetectingColumns = js.native
  /**
    * The column that contains the contents of the document.
    */
  var DocumentDataColumnName: ColumnName = js.native
  /**
    * The column that provides the document's unique identifier.
    */
  var DocumentIdColumnName: ColumnName = js.native
  /**
    * The column that contains the title of the document.
    */
  var DocumentTitleColumnName: js.UndefOr[ColumnName] = js.native
  /**
    * An array of objects that map database column names to the corresponding fields in an index. You must first create the fields in the index using the UpdateIndex operation.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
}

object ColumnConfiguration {
  @scala.inline
  def apply(
    ChangeDetectingColumns: ChangeDetectingColumns,
    DocumentDataColumnName: ColumnName,
    DocumentIdColumnName: ColumnName,
    DocumentTitleColumnName: ColumnName = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null
  ): ColumnConfiguration = {
    val __obj = js.Dynamic.literal(ChangeDetectingColumns = ChangeDetectingColumns.asInstanceOf[js.Any], DocumentDataColumnName = DocumentDataColumnName.asInstanceOf[js.Any], DocumentIdColumnName = DocumentIdColumnName.asInstanceOf[js.Any])
    if (DocumentTitleColumnName != null) __obj.updateDynamic("DocumentTitleColumnName")(DocumentTitleColumnName.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfiguration]
  }
}

