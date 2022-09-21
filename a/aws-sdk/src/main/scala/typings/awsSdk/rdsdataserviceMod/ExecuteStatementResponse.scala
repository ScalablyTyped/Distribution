package typings.awsSdk.rdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteStatementResponse extends StObject {
  
  /**
    * Metadata for the columns included in the results. This field is blank if the formatRecordsAs parameter is set to JSON.
    */
  var columnMetadata: js.UndefOr[Metadata] = js.undefined
  
  /**
    * A string value that represents the result set of a SELECT statement in JSON format. This value is only present when the formatRecordsAs parameter is set to JSON. The size limit for this field is currently 10 MB. If the JSON-formatted string representing the result set requires more than 10 MB, the call returns an error.
    */
  var formattedRecords: js.UndefOr[FormattedSqlRecords] = js.undefined
  
  /**
    * Values for fields generated during a DML request.  &lt;note&gt; &lt;p&gt;The &lt;code&gt;generatedFields&lt;/code&gt; data isn't supported by Aurora PostgreSQL. To get the values of generated fields, use the &lt;code&gt;RETURNING&lt;/code&gt; clause. For more information, see &lt;a href=&quot;https://www.postgresql.org/docs/10/dml-returning.html&quot;&gt;Returning Data From Modified Rows&lt;/a&gt; in the PostgreSQL documentation.&lt;/p&gt; &lt;/note&gt; 
    */
  var generatedFields: js.UndefOr[FieldList] = js.undefined
  
  /**
    * The number of records updated by the request.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined
  
  /**
    * The records returned by the SQL statement. This field is blank if the formatRecordsAs parameter is set to JSON.
    */
  var records: js.UndefOr[SqlRecords] = js.undefined
}
object ExecuteStatementResponse {
  
  inline def apply(): ExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteStatementResponse]
  }
  
  extension [Self <: ExecuteStatementResponse](x: Self) {
    
    inline def setColumnMetadata(value: Metadata): Self = StObject.set(x, "columnMetadata", value.asInstanceOf[js.Any])
    
    inline def setColumnMetadataUndefined: Self = StObject.set(x, "columnMetadata", js.undefined)
    
    inline def setColumnMetadataVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columnMetadata", js.Array(value*))
    
    inline def setFormattedRecords(value: FormattedSqlRecords): Self = StObject.set(x, "formattedRecords", value.asInstanceOf[js.Any])
    
    inline def setFormattedRecordsUndefined: Self = StObject.set(x, "formattedRecords", js.undefined)
    
    inline def setGeneratedFields(value: FieldList): Self = StObject.set(x, "generatedFields", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFieldsUndefined: Self = StObject.set(x, "generatedFields", js.undefined)
    
    inline def setGeneratedFieldsVarargs(value: Field*): Self = StObject.set(x, "generatedFields", js.Array(value*))
    
    inline def setNumberOfRecordsUpdated(value: RecordsUpdated): Self = StObject.set(x, "numberOfRecordsUpdated", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecordsUpdatedUndefined: Self = StObject.set(x, "numberOfRecordsUpdated", js.undefined)
    
    inline def setRecords(value: SqlRecords): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsUndefined: Self = StObject.set(x, "records", js.undefined)
    
    inline def setRecordsVarargs(value: FieldList*): Self = StObject.set(x, "records", js.Array(value*))
  }
}
