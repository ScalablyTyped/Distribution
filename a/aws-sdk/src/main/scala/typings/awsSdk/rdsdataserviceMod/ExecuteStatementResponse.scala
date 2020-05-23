package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteStatementResponse extends js.Object {
  /**
    * Metadata for the columns included in the results.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.native
  /**
    * Values for fields generated during the request.  &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; 
    */
  var generatedFields: js.UndefOr[FieldList] = js.native
  /**
    * The number of records updated by the request.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.native
  /**
    * The records returned by the SQL statement.
    */
  var records: js.UndefOr[SqlRecords] = js.native
}

object ExecuteStatementResponse {
  @scala.inline
  def apply(
    columnMetadata: Metadata = null,
    generatedFields: FieldList = null,
    numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined,
    records: SqlRecords = null
  ): ExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata.asInstanceOf[js.Any])
    if (generatedFields != null) __obj.updateDynamic("generatedFields")(generatedFields.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRecordsUpdated)) __obj.updateDynamic("numberOfRecordsUpdated")(numberOfRecordsUpdated.get.asInstanceOf[js.Any])
    if (records != null) __obj.updateDynamic("records")(records.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementResponse]
  }
}

