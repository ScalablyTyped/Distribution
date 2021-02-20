package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStatementResponse extends StObject {
  
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
  implicit class ExecuteStatementResponseMutableBuilder[Self <: ExecuteStatementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnMetadata(value: Metadata): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
    
    @scala.inline
    def setColumnMetadataVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columnMetadata", js.Array(value :_*))
    
    @scala.inline
    def setGeneratedFields(value: FieldList): Self = StObject.set(x, "generatedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratedFieldsUndefined: Self = StObject.set(x, "generatedFields", js.undefined)
    
    @scala.inline
    def setGeneratedFieldsVarargs(value: Field*): Self = StObject.set(x, "generatedFields", js.Array(value :_*))
    
    @scala.inline
    def setNumberOfRecordsUpdated(value: RecordsUpdated): Self = StObject.set(x, "numberOfRecordsUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecordsUpdatedUndefined: Self = StObject.set(x, "numberOfRecordsUpdated", js.undefined)
    
    @scala.inline
    def setRecords(value: SqlRecords): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    @scala.inline
    def setRecordsVarargs(value: FieldList*): Self = StObject.set(x, "records", js.Array(value :_*))
  }
}
