package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeliveryStreamsInput extends StObject {
  
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.   This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
    */
  var DeliveryStreamType: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamType] = js.native
  
  /**
    * The list of delivery streams returned by this call to ListDeliveryStreams will start with the delivery stream whose name comes alphabetically immediately after the name you specify in ExclusiveStartDeliveryStreamName.
    */
  var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.native
  
  /**
    * The maximum number of delivery streams to list. The default value is 10.
    */
  var Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.native
}
object ListDeliveryStreamsInput {
  
  @scala.inline
  def apply(): ListDeliveryStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeliveryStreamsInput]
  }
  
  @scala.inline
  implicit class ListDeliveryStreamsInputMutableBuilder[Self <: ListDeliveryStreamsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamType(value: DeliveryStreamType): Self = StObject.set(x, "DeliveryStreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamTypeUndefined: Self = StObject.set(x, "DeliveryStreamType", js.undefined)
    
    @scala.inline
    def setExclusiveStartDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "ExclusiveStartDeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartDeliveryStreamNameUndefined: Self = StObject.set(x, "ExclusiveStartDeliveryStreamName", js.undefined)
    
    @scala.inline
    def setLimit(value: ListDeliveryStreamsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
