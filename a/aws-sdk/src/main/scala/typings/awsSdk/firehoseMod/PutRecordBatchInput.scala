package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordBatchInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName
  
  /**
    * One or more records.
    */
  var Records: PutRecordBatchRequestEntryList
}
object PutRecordBatchInput {
  
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Records: PutRecordBatchRequestEntryList): PutRecordBatchInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchInput]
  }
  
  @scala.inline
  implicit class PutRecordBatchInputMutableBuilder[Self <: PutRecordBatchInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecords(value: PutRecordBatchRequestEntryList): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value :_*))
  }
}
