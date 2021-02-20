package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationSchema extends StObject {
  
  /**
    * Specifies the format of the records on the output stream.
    */
  var RecordFormatType: typings.awsSdk.kinesisanalyticsv2Mod.RecordFormatType = js.native
}
object DestinationSchema {
  
  @scala.inline
  def apply(RecordFormatType: RecordFormatType): DestinationSchema = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationSchema]
  }
  
  @scala.inline
  implicit class DestinationSchemaMutableBuilder[Self <: DestinationSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordFormatType(value: RecordFormatType): Self = StObject.set(x, "RecordFormatType", value.asInstanceOf[js.Any])
  }
}
