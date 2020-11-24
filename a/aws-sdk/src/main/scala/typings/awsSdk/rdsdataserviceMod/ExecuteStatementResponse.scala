package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResponse]
  }
  
  @scala.inline
  implicit class ExecuteStatementResponseOps[Self <: ExecuteStatementResponse] (val x: Self) extends AnyVal {
    
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
    def setColumnMetadataVarargs(value: ColumnMetadata*): Self = this.set("columnMetadata", js.Array(value :_*))
    
    @scala.inline
    def setColumnMetadata(value: Metadata): Self = this.set("columnMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMetadata: Self = this.set("columnMetadata", js.undefined)
    
    @scala.inline
    def setGeneratedFieldsVarargs(value: Field*): Self = this.set("generatedFields", js.Array(value :_*))
    
    @scala.inline
    def setGeneratedFields(value: FieldList): Self = this.set("generatedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedFields: Self = this.set("generatedFields", js.undefined)
    
    @scala.inline
    def setNumberOfRecordsUpdated(value: RecordsUpdated): Self = this.set("numberOfRecordsUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRecordsUpdated: Self = this.set("numberOfRecordsUpdated", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: FieldList*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: SqlRecords): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecords: Self = this.set("records", js.undefined)
  }
}
