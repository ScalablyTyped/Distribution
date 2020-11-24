package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSchemaUpdate extends js.Object {
  
  /**
    * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream.
    */
  var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.native
  
  /**
    * Specifies the encoding of the records in the streaming source; for example, UTF-8.
    */
  var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.native
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.native
}
object InputSchemaUpdate {
  
  @scala.inline
  def apply(): InputSchemaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSchemaUpdate]
  }
  
  @scala.inline
  implicit class InputSchemaUpdateOps[Self <: InputSchemaUpdate] (val x: Self) extends AnyVal {
    
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
    def setRecordColumnUpdatesVarargs(value: RecordColumn*): Self = this.set("RecordColumnUpdates", js.Array(value :_*))
    
    @scala.inline
    def setRecordColumnUpdates(value: RecordColumns): Self = this.set("RecordColumnUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordColumnUpdates: Self = this.set("RecordColumnUpdates", js.undefined)
    
    @scala.inline
    def setRecordEncodingUpdate(value: RecordEncoding): Self = this.set("RecordEncodingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordEncodingUpdate: Self = this.set("RecordEncodingUpdate", js.undefined)
    
    @scala.inline
    def setRecordFormatUpdate(value: RecordFormat): Self = this.set("RecordFormatUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordFormatUpdate: Self = this.set("RecordFormatUpdate", js.undefined)
  }
}
