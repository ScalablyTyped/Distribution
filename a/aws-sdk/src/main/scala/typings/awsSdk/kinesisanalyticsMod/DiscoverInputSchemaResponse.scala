package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverInputSchemaResponse extends StObject {
  
  /**
    * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  
  /**
    * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
    */
  var ParsedInputRecords: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ParsedInputRecords] = js.native
  
  /**
    * Stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
    */
  var ProcessedInputRecords: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.ProcessedInputRecords] = js.native
  
  /**
    * Raw stream data that was sampled to infer the schema.
    */
  var RawInputRecords: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RawInputRecords] = js.native
}
object DiscoverInputSchemaResponse {
  
  @scala.inline
  def apply(): DiscoverInputSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInputSchemaResponse]
  }
  
  @scala.inline
  implicit class DiscoverInputSchemaResponseMutableBuilder[Self <: DiscoverInputSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSchemaUndefined: Self = StObject.set(x, "InputSchema", js.undefined)
    
    @scala.inline
    def setParsedInputRecords(value: ParsedInputRecords): Self = StObject.set(x, "ParsedInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedInputRecordsUndefined: Self = StObject.set(x, "ParsedInputRecords", js.undefined)
    
    @scala.inline
    def setParsedInputRecordsVarargs(value: ParsedInputRecord*): Self = StObject.set(x, "ParsedInputRecords", js.Array(value :_*))
    
    @scala.inline
    def setProcessedInputRecords(value: ProcessedInputRecords): Self = StObject.set(x, "ProcessedInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessedInputRecordsUndefined: Self = StObject.set(x, "ProcessedInputRecords", js.undefined)
    
    @scala.inline
    def setProcessedInputRecordsVarargs(value: ProcessedInputRecord*): Self = StObject.set(x, "ProcessedInputRecords", js.Array(value :_*))
    
    @scala.inline
    def setRawInputRecords(value: RawInputRecords): Self = StObject.set(x, "RawInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawInputRecordsUndefined: Self = StObject.set(x, "RawInputRecords", js.undefined)
    
    @scala.inline
    def setRawInputRecordsVarargs(value: RawInputRecord*): Self = StObject.set(x, "RawInputRecords", js.Array(value :_*))
  }
}
