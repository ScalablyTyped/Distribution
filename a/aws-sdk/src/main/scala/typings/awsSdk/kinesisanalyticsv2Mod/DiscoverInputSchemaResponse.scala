package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoverInputSchemaResponse extends js.Object {
  
  /**
    * The schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.native
  
  /**
    * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
    */
  var ParsedInputRecords: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ParsedInputRecords] = js.native
  
  /**
    * The stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
    */
  var ProcessedInputRecords: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ProcessedInputRecords] = js.native
  
  /**
    * The raw stream data that was sampled to infer the schema.
    */
  var RawInputRecords: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.RawInputRecords] = js.native
}
object DiscoverInputSchemaResponse {
  
  @scala.inline
  def apply(): DiscoverInputSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInputSchemaResponse]
  }
  
  @scala.inline
  implicit class DiscoverInputSchemaResponseOps[Self <: DiscoverInputSchemaResponse] (val x: Self) extends AnyVal {
    
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
    def setInputSchema(value: SourceSchema): Self = this.set("InputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSchema: Self = this.set("InputSchema", js.undefined)
    
    @scala.inline
    def setParsedInputRecordsVarargs(value: ParsedInputRecord*): Self = this.set("ParsedInputRecords", js.Array(value :_*))
    
    @scala.inline
    def setParsedInputRecords(value: ParsedInputRecords): Self = this.set("ParsedInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsedInputRecords: Self = this.set("ParsedInputRecords", js.undefined)
    
    @scala.inline
    def setProcessedInputRecordsVarargs(value: ProcessedInputRecord*): Self = this.set("ProcessedInputRecords", js.Array(value :_*))
    
    @scala.inline
    def setProcessedInputRecords(value: ProcessedInputRecords): Self = this.set("ProcessedInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessedInputRecords: Self = this.set("ProcessedInputRecords", js.undefined)
    
    @scala.inline
    def setRawInputRecordsVarargs(value: RawInputRecord*): Self = this.set("RawInputRecords", js.Array(value :_*))
    
    @scala.inline
    def setRawInputRecords(value: RawInputRecords): Self = this.set("RawInputRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawInputRecords: Self = this.set("RawInputRecords", js.undefined)
  }
}
