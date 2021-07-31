package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecordInput extends StObject {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName
  
  /**
    * The record.
    */
  var Record: typings.awsSdk.firehoseMod.Record
}
object PutRecordInput {
  
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName, Record: Record): PutRecordInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], Record = Record.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordInput]
  }
  
  @scala.inline
  implicit class PutRecordInputMutableBuilder[Self <: PutRecordInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecord(value: Record): Self = StObject.set(x, "Record", value.asInstanceOf[js.Any])
  }
}
