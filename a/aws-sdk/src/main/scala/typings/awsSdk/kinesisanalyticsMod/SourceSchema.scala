package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSchema extends StObject {
  
  /**
    * A list of RecordColumn objects.
    */
  var RecordColumns: typings.awsSdk.kinesisanalyticsMod.RecordColumns = js.native
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncoding: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RecordEncoding] = js.native
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormat: typings.awsSdk.kinesisanalyticsMod.RecordFormat = js.native
}
object SourceSchema {
  
  @scala.inline
  def apply(RecordColumns: RecordColumns, RecordFormat: RecordFormat): SourceSchema = {
    val __obj = js.Dynamic.literal(RecordColumns = RecordColumns.asInstanceOf[js.Any], RecordFormat = RecordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSchema]
  }
  
  @scala.inline
  implicit class SourceSchemaMutableBuilder[Self <: SourceSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumns(value: RecordColumns): Self = StObject.set(x, "RecordColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordColumnsVarargs(value: RecordColumn*): Self = StObject.set(x, "RecordColumns", js.Array(value :_*))
    
    @scala.inline
    def setRecordEncoding(value: RecordEncoding): Self = StObject.set(x, "RecordEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordEncodingUndefined: Self = StObject.set(x, "RecordEncoding", js.undefined)
    
    @scala.inline
    def setRecordFormat(value: RecordFormat): Self = StObject.set(x, "RecordFormat", value.asInstanceOf[js.Any])
  }
}
