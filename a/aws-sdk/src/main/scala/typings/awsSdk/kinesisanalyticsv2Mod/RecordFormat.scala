package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordFormat extends js.Object {
  
  /**
    * When you configure application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var MappingParameters: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.MappingParameters] = js.native
  
  /**
    * The type of record format.
    */
  var RecordFormatType: typings.awsSdk.kinesisanalyticsv2Mod.RecordFormatType = js.native
}
object RecordFormat {
  
  @scala.inline
  def apply(RecordFormatType: RecordFormatType): RecordFormat = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFormat]
  }
  
  @scala.inline
  implicit class RecordFormatOps[Self <: RecordFormat] (val x: Self) extends AnyVal {
    
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
    def setRecordFormatType(value: RecordFormatType): Self = this.set("RecordFormatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingParameters(value: MappingParameters): Self = this.set("MappingParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappingParameters: Self = this.set("MappingParameters", js.undefined)
  }
}
