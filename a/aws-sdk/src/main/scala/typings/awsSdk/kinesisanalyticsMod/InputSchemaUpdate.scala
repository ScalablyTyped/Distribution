package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSchemaUpdate extends StObject {
  
  /**
    * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream. 
    */
  var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.native
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
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
  implicit class InputSchemaUpdateMutableBuilder[Self <: InputSchemaUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumnUpdates(value: RecordColumns): Self = StObject.set(x, "RecordColumnUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordColumnUpdatesUndefined: Self = StObject.set(x, "RecordColumnUpdates", js.undefined)
    
    @scala.inline
    def setRecordColumnUpdatesVarargs(value: RecordColumn*): Self = StObject.set(x, "RecordColumnUpdates", js.Array(value :_*))
    
    @scala.inline
    def setRecordEncodingUpdate(value: RecordEncoding): Self = StObject.set(x, "RecordEncodingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordEncodingUpdateUndefined: Self = StObject.set(x, "RecordEncodingUpdate", js.undefined)
    
    @scala.inline
    def setRecordFormatUpdate(value: RecordFormat): Self = StObject.set(x, "RecordFormatUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordFormatUpdateUndefined: Self = StObject.set(x, "RecordFormatUpdate", js.undefined)
  }
}
